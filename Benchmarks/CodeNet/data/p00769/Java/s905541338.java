

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		new Main().start();
	}
	void start(){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int i= 0; i < n; i++){
			String s = in.next();
			Node node = null;
			Node parent = null;
			Node root = null;
			for(int j =0; j < s.length(); j++){
				switch(s.charAt(j)){
				case '[':
					node = new Node(parent);
					if(parent == null){
						parent = node;
						root = node;
					}else{
						parent.children.add(node);
						node.parent = parent;
						parent = node;
					}
					break;
				case ']':
					parent = node.parent;
					node =  node.parent;
					break;
				default:
					String ss = ""+s.charAt(j);
					j++;
					while(s.charAt(j) != ']'){
						ss += ""+s.charAt(j);
						j++;
					}
					j--;
					node.value = Integer.parseInt(ss);
					node.isLeaf = true;
				}
			}
			root.calcValue();
			System.out.println(root.value);
		}
		in.close();
	}
	Node getRoot(Node n){
		while(n.parent != null){
			n = n.parent;
		}
		return n;
	}
	class Node implements Comparable<Node>{
		Node parent;
		ArrayList<Node> children;
		int value;
		boolean isLeaf = false;
		Node(Node p){
			parent = p;
			children = new ArrayList<Node>();
			value = -1;
		}
		void calcValue(){
			if(!canCalc()){
				for(Node n : children){
					n.calcValue();
				}
			}
			Collections.sort(children);
//			System.out.println(children.size());
//			for(Node n : children){
//				System.out.print(n.value + " ");
//			}
//			System.out.println("");
			int a = 0;
			for(int i = 0; i < children.size()/2+1; i++){
				if(children.get(i).isLeaf){
					a += children.get(i).value/2+1;
				}else{
					a += children.get(i).value;
				}
			}
			value = a;
		}
		boolean canCalc(){
			for(Node n : children){
				if(n.value == -1) return false;
			}
			return true;
		}
		@Override
		public int compareTo(Node o) {
			// TODO ?????????????????????????????????????????????
			return this.value - o.value;
		}
	}

}