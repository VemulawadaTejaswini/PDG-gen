import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		int nodeCount=scn.nextInt(),linkCount=scn.nextInt();
		
		List<Node> nodes=new ArrayList<>(nodeCount);
		for(int i=0;i<nodeCount;i++)
			nodes.add(new Node());
		
		Set<Node> exploredNodes=new HashSet<>(nodes);
		
		for(int i=0;i<linkCount;i++) {
			Node n1=nodes.get(scn.nextInt()-1),n2=nodes.get(scn.nextInt()-1);
			n1.links.add(n2);
			n2.links.add(n1);
		}
		
		List<Node> explore=new ArrayList<>(),exploreNext=new ArrayList<>();
		explore.add(nodes.get(0));
		int length=1;
		while(!explore.isEmpty()){
			for(Node from:explore) {
				for(Node to:from.links) {
					if(to.mark==null) {
						to.mark=from;
						to.length=length;
						exploreNext.add(to);
						exploredNodes.remove(to);
					}
				}
			}
			explore.clear();
			List<Node> swap=explore;
			explore=exploreNext;
			exploreNext=swap;
			length++;
		}
		
		if(!exploredNodes.isEmpty()) {
			System.out.println("No");
			return;
		}
		
		System.out.println("Yes");
		for(int i=1;i<nodeCount;i++)
			System.out.println(nodes.get(i).length);
		
	}
	
	private static class Node{
		Set<Node> links=new HashSet<>();
		Node mark=null;
		int length=0;
	}

}
