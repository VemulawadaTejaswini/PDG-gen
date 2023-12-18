import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	
	public static final String INSERT = "insert";
	public static final String PRINT = "print";
	public static Node root; 

	public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int commandNum =Integer.parseInt(br.readLine());
        root = null;
        for(int i = 0 ; i < commandNum; i++){
        	        	execute(br);
        }
	}
	
		 	 	 	 	 	 	private static void execute(BufferedReader br) throws Exception{
		String tmp = br.readLine();
		
				if(tmp.startsWith(INSERT)){ 			insert(Integer.parseInt(tmp.substring(INSERT.length() + 1)));
		}else if(tmp.startsWith(PRINT)){ 			print();
		}
		
	}
	
	private static void insert(int key){
		Node node = makeNode(key);
				if(root == null){
			root = node;
		}else{
						Node comparisonNode = root;
						Node parentNode = null;
						LR LRFlag = null;
			
						while(comparisonNode != null){
								parentNode = comparisonNode;
				if(node.getKey() < comparisonNode.getKey()){
										comparisonNode = comparisonNode.getLeft();
					LRFlag = LR.LEFT;
				}else if(node.getKey() > comparisonNode.getKey()){
										comparisonNode = comparisonNode.getRight();
					LRFlag = LR.RIGHT;
				}
			}
			
						node.setParent(parentNode);
			
						 			 			 			if(LRFlag == LR.LEFT){
				parentNode.setLeft(node);
			}else if(LRFlag == LR.RIGHT){
				parentNode.setRight(node);
			}
		}
	}
	
	private static Node makeNode(int key){
		return new Node(key);
	}
	
	private static void print(){
		StringBuffer sb = new StringBuffer();
		
				inorderPrint(root,sb);
		System.out.println(sb.toString().trim());
		
				sb.delete(0,sb.length() - 1);
		
				preorderPrint(root,sb);
		System.out.print(sb.toString().trim());
	}
	
		 	 	private static void inorderPrint(Node node,StringBuffer sb){
		if(node == null){
			return;
		}
		inorderPrint(node.getLeft(),sb);
		sb.append(node.getKey());
		sb.append(" ");
		inorderPrint(node.getRight(),sb);
	}
	
		 	 	private static void preorderPrint(Node node,StringBuffer sb){
		if(node == null){
			return;
		}
		sb.append(node.getKey());
		sb.append(" ");
		preorderPrint(node.getLeft(), sb);
		preorderPrint(node.getRight(), sb);
	}
	
	enum LR{
		LEFT,RIGHT;
	}

}

class Node{
	
	private int key;
	private Node left;
	private Node right;
	private Node parent;
	
	public Node(int key){
		this.key = key;
	}
	
	public int getKey() {
		return key;
	}
	public void setKey(int key) {
		this.key = key;
	}
	public Node getLeft() {
		return left;
	}
	public void setLeft(Node left) {
		this.left = left;
	}
	public Node getRight() {
		return right;
	}
	public void setRight(Node right) {
		this.right = right;
	}
	public Node getParent() {
		return parent;
	}
	public void setParent(Node parent) {
		this.parent = parent;
	}
}