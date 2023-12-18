

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Stack;

public class Main 
{

	public static void main(String[] args) 
	{
		new DataSet();
	}

	static class DataSet
	{
		Scanner scan = new Scanner(System.in);
		int cityNum;
		int roadNum;
		int start;
		int finish;
		ArrayList<City> cities = new ArrayList<City>();
		ArrayList<Road> roads = new ArrayList<Road>();
		QueueComparator qc = new QueueComparator();
		PriorityQueue<QueueEntry> pq = new PriorityQueue<QueueEntry>(qc);
		int[] distanceTo;
		boolean[] visited;
		
		boolean checkSever()
		{
			for(Road severedroad : roads)
			{
				boolean roadIsBridge = true;
				boolean[] svisited = new boolean[cityNum];
				
				Stack<Integer> stack = new Stack<Integer>();
				stack.add(start);
				svisited[start] = true;
				
//				System.out.println("checking new road " + (severedroad.city1+1) + " -> " + (severedroad.city2+1));
				
				while(!stack.isEmpty())
				{
					int curpos = stack.pop();
					
					for(int connectedCity : cities.get(curpos).connected)
					{
						if((severedroad.city1 == curpos && severedroad.city2 == connectedCity) || (severedroad.city2 == curpos && severedroad.city1 == connectedCity))
						{
							//this road is severed.
						}
						else
						{
							if(connectedCity == start)
							{
								//reach start. this road is not a bridge.
//								System.out.println("NOT A BRIDGE");
								roadIsBridge = false;
								stack.clear();
								break;
							}
							
							//go there, since it's neither visited nor severed
							if(!svisited[connectedCity])
							{
								stack.push(connectedCity);
								svisited[connectedCity] = true;
							}
						}
					}
				}
				
				if(roadIsBridge) {return true;}
			}
			return false;
		}
		
		public DataSet()
		{
			cityNum = scan.nextInt();
			roadNum = scan.nextInt();
			start = scan.nextInt()-1;
			finish = scan.nextInt()-1;
			
			distanceTo = new int[cityNum];
			visited = new boolean[cityNum];
			
			for(int i = 0; i < cityNum; i++)
			{
				cities.add(new City(i));
			}
			
			for(int i = 0; i < roadNum; i++)
			{
				int city1 = scan.nextInt()-1;
				int city2 = scan.nextInt()-1;
				int dist = scan.nextInt();
				
				cities.get(city1).addRoad(city2, dist);
				cities.get(city2).addRoad(city1, dist);
				
				roads.add(new Road(city1, city2));
			}
			
			//first, find best case
			if(checkSever())
			{
				System.out.println("-1");
				return;
			}
			
			City curCity = cities.get(start);
			visited[start] = true;
			boolean foundFinish = false;
			boolean foundFinish2 = false;
			int prevCity = -99;
			int distance1 = -99;
			int distance2 = -99;
			
			while(!foundFinish2)
			{
				for(int connected : curCity.connected)
				{
					if(!visited[connected])
					{
						//add adjacent unvisited cities into queue
						QueueEntry qe = new QueueEntry(connected, distanceTo[curCity.index] + curCity.distance.get(curCity.connected.indexOf(connected)));
						qe.from = curCity.index;
						pq.add(qe);
					}
				}
					
				//poll queues, if it's still unvisited, visit it.
				if(pq.isEmpty())
				{
					System.out.println("-1");
					return;
				}
				
				boolean stillFindingCityToVisit = true;
				while(stillFindingCityToVisit)
				{
					
					QueueEntry next = pq.poll();
					
					if(visited[next.cityindex] == false)
					{
						//visit it.
						if(next.cityindex == finish && !foundFinish) {distance1 = distanceTo[next.from];}
						
						prevCity = next.from;
						distanceTo[next.cityindex] = next.distance;
						
						stillFindingCityToVisit = false;
						visited[next.cityindex] = true;
						
						curCity = cities.get(next.cityindex);
					}
				}
				
				if(curCity.index == finish)
				{
					if(!foundFinish) //first time to finish
					{
						foundFinish = true;
						//cut the bridge
						cities.get(prevCity).removeRoad(curCity.index);
						cities.get(curCity.index).removeRoad(prevCity);

						//go back
						curCity = cities.get(prevCity);
						
						//clear visiteds and distanceTo and queue
						pq.clear();
						for(int i = 0; i < cityNum; i++)
						{
							visited[i] = false;
							distanceTo[i] = 0;
						}
						visited[prevCity] = true;
					}
					else
					{
						distance2 = distanceTo[curCity.index];
						foundFinish2 = true;
						int ans = distance1 + distance2;
						System.out.println(ans);
					}
				}
			}
			
			
			
		}
		
		static class QueueComparator implements Comparator<QueueEntry>
		{

			@Override
			public int compare(QueueEntry o1, QueueEntry o2) 
			{
				return o1.distance - o2.distance;
			}
		}
		
		static class QueueEntry
		{
			int distance;
			int cityindex;
			int from;
			
			public QueueEntry(int city, int dist)
			{
				cityindex = city;
				distance = dist;
			}
		}
		
		static class Road
		{
			int city1;
			int city2;
			
			public Road(int c1, int c2)
			{
				city1 = c1;
				city2 = c2;
			}
		}
		
		static class City
		{
			ArrayList<Integer> connected = new ArrayList<Integer>();
			ArrayList<Integer> distance = new ArrayList<Integer>();
			int index;
			
			void addRoad(int targetCity, int distance)
			{
				connected.add(targetCity);
				this.distance.add(distance);
			}
			
			void removeRoad(int targetCity)
			{
				int i = connected.indexOf(targetCity);
				connected.remove(i);
				distance.remove(i);
			}
			
			public City(int index)
			{
				this.index = index;
			}
		}
	}
}
