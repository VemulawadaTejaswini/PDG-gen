import java.io.BufferedReader;
//import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Node[] node = input();
		
		// search root
		Node root = null;
		for(int i = 0; i < node.length; ++i) {
			if(node[i].getType().equals("root")) {
				root = node[i];
				break;
			}
		}
		
		// print
		StringBuilder sb = new StringBuilder();
		sb.append("Preorder\n");
		sb.append(preorder(root) + "\n");

		sb.append("Inorder\n");
		sb.append(inorder(root) + "\n");
		
		sb.append("Postorder\n");
		sb.append(postorder(root) + "\n");
		System.out.print(sb);
	}
	
	public static String preorder(Node node){
		String str = String.valueOf(node.id);
		for(int i = 0; i < node.child.size(); ++i) {
			str += " " + preorder(node.child.get(i));
		}
		return str;
	}
	
	public static String inorder(Node node){
		int c = node.child.size();
		String str = "";
		if(c > 0){
			str += inorder(node.child.get(0)) + " ";
		}
		str += String.valueOf(node.id);
		if(c == 2){
			str += " " + inorder(node.child.get(1));
		}
		return str;
	}
	
	public static String postorder(Node node){
		String str = "";
		for(int i = 0; i < node.child.size(); ++i) {
			str += postorder(node.child.get(i)) + " ";
		}
		str += String.valueOf(node.id);
		return str;
	}
	
	public static Node[] input() throws NumberFormatException, IOException{
		//System.setIn(new FileInputStream("./input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Node[] node = new Node[n];
		
		for(int i = 0; i < n; ++i) {
			node[i] = new Node(i);
		}
		
		for(int i = 0; i < n; ++i) {
			String[] t = br.readLine().split(" ");
			int id = Integer.parseInt(t[0]);
			
			int c1 = Integer.parseInt(t[1]);
			int c2 = Integer.parseInt(t[2]);
			
			if(c1 != -1){
				node[id].child.add(node[c1]);
				node[c1].parent = node[id];
			}
			if(c2 != -1){
				node[id].child.add(node[c2]);
				node[c2].parent = node[id];
			}
			if(c1 != -1 && c2 != -1){
				node[c1].sibling = node[c2];
				node[c2].sibling = node[c1];
			}
		}
		return node;
	}

}

class Node {
	public int id;
	public Node parent;
	public ArrayList<Node> child = new ArrayList<Node>();
	public Node sibling;
	public Node(int id){
		this.id = id;
		if(id != -1){
			parent = sibling = new Node(-1);
		}
	}

	public int getDepth(){
		if(parent.id == -1){
			return 0;
		}else{
			return parent.getDepth() + 1;
		}
	}
	
	public int getHeight(){
		if(child.size() == 0){
			return 0;
		}else if(child.size() == 1){
			return child.get(0).getHeight() + 1;
		}else{
			return Math.max(child.get(0).getHeight(), child.get(1).getHeight()) + 1;
		}
	}
	
	public int getDegree(){
		return child.size();
	}
	
	public String getType(){
		if(parent.id == -1){
			return "root";
		}else if(child.size() == 0){
			return "leaf";
		}else{
			return "internal node";
		}
		
	}
}