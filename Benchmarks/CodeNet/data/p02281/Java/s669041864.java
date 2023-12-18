import java.io.BufferedReader;
//import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Node[] node = input();
		
		// search root
		Node root = null;
		for(int i = 0; i < node.length; ++i) {
			if(node[i].type().equals("root")) {
				root = node[i];
				break;
			}
		}
		
		// print
		StringBuilder sb = new StringBuilder();
		sb.append("Preorder\n");
		sb.append(" " + preorder(root) + "\n");

		sb.append("Inorder\n");
		sb.append(" " + inorder(root) + "\n");
		
		sb.append("Postorder\n");
		sb.append(" " + postorder(root) + "\n");
		System.out.print(sb);
	}
	
	public static String preorder(Node node){
		String str = String.valueOf(node.id);
		for(int i = 0; i < 2; ++i) {
			if(node.child[i].id != -1) {
				str += " " + preorder(node.child[i]);
			}
		}
		return str;
	}
	
	public static String inorder(Node node){
		String str = "";
		if(node.child[0].id != -1){
			str += inorder(node.child[0]) + " ";
		}
		str += String.valueOf(node.id);
		if(node.child[1].id != -1){
			str += " " + inorder(node.child[1]);
		}
		return str;
	}
	
	public static String postorder(Node node){
		String str = "";
		if(node.child[0].id != -1){
			str += postorder(node.child[0]) + " ";
		}
		if(node.child[1].id != -1){
			str += postorder(node.child[1]) + " ";
		}
		str += String.valueOf(node.id);
		return str;
	}
	
	public static Node[] input() throws NumberFormatException, IOException{
		//System.setIn(new FileInputStream("./ALDS1_7_C-in6.txt")); //./input.txt"));
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
				node[id].child[0] = node[c1];
				node[c1].parent = node[id];
			}
			if(c2 != -1){
				node[id].child[1] = node[c2];
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
	public Node[] child = new Node[2];
	public Node sibling;
	public Node(int id){
		this.id = id;
		if(id != -1){
			parent = sibling = child[0] = child[1] = new Node(-1);
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
		if(degree() == 0){
			return 0;
		}else{
			int h = -1;
			for(int i = 0; i < 2; ++i) {
				if(child[i].id != -1) {
					int hi = child[i].getHeight() + 1;
					if(h < hi){
						h = hi;
					}
				}
			}
			return h;
		}
	}
	
	public int degree(){
		int deg = 0;
		for(int i = 0; i < 2; ++i){
			if(child[i].id != -1){
				deg += 1;
			}
		}
		return deg;
	}
	
	public String type(){
		if(parent.id == -1){
			return "root";
		}else if(degree() == 0){
			return "leaf";
		}else{
			return "internal node";
		}
		
	}
}