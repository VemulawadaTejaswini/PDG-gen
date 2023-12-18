
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author prashant
 *
 */
public class Main {

	public static void main(String[] args) {
		try(Scanner scanner = new Scanner(System.in)){
			int n = scanner.nextInt();
			Node[] nodes = new Node[n];
			for(int i = 0; i<n; i++){
				nodes[i] = new Node(i);				
			}
			for(int i=1;i<n;i++){
				nodes[scanner.nextInt()].addNode(nodes[scanner.nextInt()], scanner.nextInt());
//				System.out.println("--");
			}
			int i = 0;
			for (; i < nodes.length; i++) {
				if(nodes[i].parent == null) break;
			}
			System.out.println(nodes[i].getDiameter());
		}catch(Exception e){
			System.out.println(-1);
		}
	}
	
	
	static class Node {
		
		private List<Node> childs = new ArrayList<>();
		private List<Long> weigths = new ArrayList<>();
		private Node parent;
		private int index;
		
		private long weightedHeight = - 1;
		
		public Node(int i) {
			index = i;
		}

		public void addNode(Node node, long weight){
//			if(node.parent == null){
//				childs.add(node);
//				weigths.add(weight);
//				node.parent = this;
//			}else{
//				node.addNode(this, weight);
//			}
			if(node.parent == null){
				childs.add(node);
				weigths.add(weight);
				node.parent = this;
			}else{
				Node p = node.parent;
				node.parent= null;
				int indexOf = p.childs.indexOf(node);
				p.childs.remove(indexOf);
				Long weight2 = p.weigths.get(indexOf);
				p.weigths.remove(indexOf);
				
				node.addNode(p, weight2);

				this.addNode(node, weight);
//				childs.add(node);
//				weigths.add(weight);
//				node.parent = this;
			}
		
		}
		
		public long getWeightedHeight(){
			if(weightedHeight != -1) return weightedHeight;
			long wheight = 0;
			for (int i=0;i<childs.size();i++){
				wheight = Math.max(wheight,weigths.get(i) + childs.get(i).getWeightedHeight());
			}
			weightedHeight = wheight;
			return wheight;
		}
		
		public long getDiameter(){
			long diameter = 0;
			long h1 = 0, h2 = 0;
			Integer i1 = null, i2 = null;
			for (int i=0;i<childs.size();i++){
				diameter = Math.max(diameter, childs.get(i).getDiameter());
				long height = childs.get(i).getWeightedHeight() + weigths.get(i);
				if(height > h2 && height < h1){
					h2 = height;
					i2 = i;
				}
				if(height >= h1){
					h2 = h1;
					h1 = height;
					i2 = i1;
					i1 = i;
				}
			}
			if(i1 != null && i2 != null){
				diameter = Math.max(diameter, h1 + h2);				
			}else if (i1 != null){
				diameter = Math.max(diameter, h1);					
			}else if (i2 != null){
				diameter = Math.max(diameter, h2);				
			}
			return diameter;
		}
	}
}

