

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Stack;

public class Main 
{
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) 
	{
		while(true)
		{
			int n = scan.nextInt();
			int a = scan.nextInt();
			int s = scan.nextInt();
			int g = scan.nextInt();
			
			if(n == 0)
			{
				break;
			}
			else
			{
				new DataSet(n,a,s,g);
			}
		}
	}
	
	static class DataSet
	{
		int nodesNum;
		int arrowsNum;
		int starNode;
		int goldNode;
		int curNodeNum;
		Node[] nodes;
		List<Integer> visitedNodes = new ArrayList<Integer>();
		Stack<Integer> withdrawNodes = new Stack<Integer>();
		Stack<String> withdrawMantra = new Stack<String>();
		
		Stack<Integer> toDoStart = new Stack<Integer>();
		Stack<Integer> toDoDest = new Stack<Integer>();
		Stack<String> toDoMantra = new Stack<String>();
		Stack<ArrayList<Integer>> toDoVisited = new Stack<ArrayList<Integer>>();
		
		PriorityQueue<String> gatheredMantras = new PriorityQueue<String>();
		
		String curMantra = "";
		
		public DataSet(int n, int a, int s, int g)
		{
			nodesNum = n;
			arrowsNum = a;
			starNode = s;
			goldNode = g;
			nodes = new Node[n];
			
			for(int i = 0; i < nodesNum; i++)
			{
				nodes[i] = new Node();
				nodes[i].index = i;
			}
			
			for(int i = 0; i < arrowsNum; i++)
			{
				int node1 = scan.nextInt();
				int node2 = scan.nextInt();
				String mantra = scan.next();
				
				nodes[node1].mantras.add(mantra);
				nodes[node1].destinations.add(node2);
			}
			
			curNodeNum = starNode;
			withdrawNodes.push(starNode);
			withdrawMantra.push("");
			visitedNodes.add(starNode);
			Node curNode = nodes[curNodeNum];
			curMantra = "";
			
			while(true)
			{
				//find unvisited highest priority node from current, or golden node if existing.
				//if there are none, withdraw.
				
				PriorityQueue<String> pq = new PriorityQueue<String>();
				
				for(int i = 0; i < curNode.mantras.size(); i++)
				{
					
//					if(!visitedNodes.contains(curNode.destinations))
					{ //add unvisited nodes to queue // add all nodes to queue!!
						pq.add(curNode.mantras.get(i));
					}
				}
				
				
				
				if(pq.size() == 0)
				{
					//withdraw
					if(withdrawNodes.size() == 0)
					{
						System.out.println("NO");
						return;
					}
					else
					{
//						System.out.println("Withdrawing " + withdrawNodes.size() + " " + withdrawMantra.size());
						curNodeNum = withdrawNodes.pop();
						curMantra = withdrawMantra.pop();
						curNode = nodes[curNodeNum];
					}
				}
				else
				{
					//check if loop (NO)
					if(curNode.checkDreadedLoop(this, pq.peek()))
					{
						System.out.println("NO");
						return;
					}
					//check if gold node exists
					else if(curNode.destinations.contains(goldNode))
					{
						//go to golden node, write the mantra, then do any to-do things.
						
						curMantra += curNode.getMantraOfDestNumber(goldNode);
						gatheredMantras.add(curMantra);
						
						if(toDoStart.size() == 0)
						{
							System.out.println(gatheredMantras.peek());
							return;
						}
						else
						{
							//go and do to-do stuff
							curNodeNum = toDoStart.pop();
							curMantra = toDoMantra.pop();
							visitedNodes = toDoVisited.pop();
							curNode = nodes[curNodeNum];
							
							//auto-go
							int destNode = toDoDest.pop();
							String mantraAdded = curNode.getMantraOfDestNumber(destNode);
							
							curMantra += mantraAdded;
							withdrawNodes.add(destNode);
							withdrawMantra.add(curMantra);
							curNode = nodes[destNode];
							curNodeNum = destNode;
							visitedNodes.add(destNode);
							
						}
					}
					else
					{
						//if there are several arrows with same mantras, choose one and do the rest later.
						
						//UNDER CONSTRUCTION
						int destNode = curNode.checkForMultipleMantras(this, pq.peek());
						
//						//go into the first node in the queue
						String mantraToUse = pq.peek();
//						int destNode = curNode.getDestNumberOfMantra(mantraToUse);
						
						//node decided, go there.
						curMantra += mantraToUse;
						withdrawNodes.add(destNode);
						withdrawMantra.add(curMantra);
						curNode = nodes[destNode];
						curNodeNum = destNode;
						visitedNodes.add(destNode);
						
					}
				}
			}
			
		}
	}
	
	static class Node
	{
		List<String> mantras = new ArrayList<String>();
		List<Integer> destinations = new ArrayList<Integer>(); //parallel lists
		int index;
		
		boolean checkDreadedLoop(DataSet dataSet, String bestMantra)
		{
			//if one of the arrows with the best mantra leads to a visited node...
			
			for(int i = 0; i < mantras.size(); i++)
			{
				if(mantras.get(i).equals(bestMantra) && dataSet.visitedNodes.contains(destinations.get(i)))
				{
					return true;
				}
			}
			
			return false;
		}
		
		int checkForMultipleMantras(DataSet dataSet, String bestMantra)
		{
			int count = 0;
			int destinationForNow = -1;
			for(int i = 0; i < mantras.size(); i++)
			{
				if(mantras.get(i).equals(bestMantra) && !dataSet.visitedNodes.contains(destinations.get(i)))
				{
					count += 1;
					if(count == 1) {destinationForNow = destinations.get(i);}
				}
				
				//add duplicates mantras from the 2nd and on to to-do-list, only counting those with unvisited dest. nodes though.
				if(count > 1)
				{
					dataSet.toDoStart.push(index);
					dataSet.toDoDest.push(destinations.get(i));
					dataSet.toDoMantra.push(dataSet.curMantra);
					
					ArrayList<Integer> tempVisited = new ArrayList<Integer>();
					tempVisited.addAll(dataSet.visitedNodes);
//					tempVisited.add(index); //no need for this anymore! just auto-go to destination.
					
					dataSet.toDoVisited.push(tempVisited);
				} //UNDER CONSTRUCTION
				
			}

			//return the first or only destination node index.
			return destinationForNow;
			
		}
		
		String getMantraOfDestNumber(int destNumber)
		{
			return mantras.get(destinations.indexOf(destNumber));
		}
		
		int getDestNumberOfMantra(String mantra)
		{
			return destinations.get(mantras.indexOf(mantra));
		}
	}
}

