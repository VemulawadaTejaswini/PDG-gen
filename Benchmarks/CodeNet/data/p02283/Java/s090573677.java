import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static Node root;
	public static final String INSERT = "insert";
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n =Integer.parseInt(br.readLine());
		
		for(int i = 0 ; i < n ; i++){
			String tmp = br.readLine();
			if(tmp.startsWith(INSERT)){
				insert(new Node(Integer.parseInt((tmp.substring(INSERT.length() + 1)))));
			}else if(tmp.startsWith("print")){
				print();
			}else{
				System.out.print("Error!!");
				System.exit(1);
			}
		}
		
	}
	
	private static void insert(Node node){
		if(root == null){
			root = node;
			return;
		}else{
			Node currentNode = root;
			Node parent = null;
			while(currentNode != null){
				parent = currentNode;
				if(node.id < currentNode.id){
					currentNode = currentNode.left;
				}else{
					currentNode = currentNode.right;
				}
			}
			
			node.parent = parent;
			
			if(node.id < parent.id){
				parent.left = node;
			}else{
				parent.right = node;
			}
		}
	}
	
	private static void print(){
		StringBuffer isb = new StringBuffer();
		inorderPrint(root,isb);
		System.out.println(isb.toString().trim());
		StringBuffer psb = new StringBuffer();
		postorderPrint(root,psb);
		System.out.print(psb.toString().trim());
	}
	
	private static void inorderPrint(Node node,StringBuffer sb){
		if(node == null){
			return;
		}
		inorderPrint(node.left,sb);
		sb.append(node.id);
		sb.append(" ");
		inorderPrint(node.right,sb);
	}
	
	private static void postorderPrint(Node node,StringBuffer sb){
		if(node == null){
			return;
		}
		sb.append(node.id);
		sb.append(" ");
		postorderPrint(node.left,sb);
		postorderPrint(node.right,sb);
	}
	
}

class Node{
	
	public Node(int id){
		this.id = id;
	}
	
	int id;
	Node parent;
	Node left;
	Node right;
}