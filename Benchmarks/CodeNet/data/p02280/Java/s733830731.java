import java.io.*;
import java.util.*;
public class Main{
    public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int numNodes = scan.nextInt();
		TempNodeData tempNodeData = new TempNodeData(scan);
		Node root = new Node(tempNodeData, tempNodeData.keyOfRoot());
		root.getDepth();
		for(int i=0; i<numNodes; i++)
			System.out.println(root.getNode(i));
	}

}
class Node{
	int id;
	Node parent = null;
	Node left = null;
	Node right = null;
	int depth;
	public Node(TempNodeData data, int id){//root??¨?????????????????????
		this.id = id;
		if(data.getLeftNodeID(id)!=-1)
			this.left = new Node(data, data.getLeftNodeID(id),this);
		if(data.getRightNodeID(id)!=-1)
			this.right = new Node(data, data.getRightNodeID(id),this);
	}
	public Node(TempNodeData data, int id, Node p){
		this.id = id;
		parent = p;
		if(data.getLeftNodeID(id)!=-1)
			this.left = new Node(data, data.getLeftNodeID(id),this);
		if(data.getRightNodeID(id)!=-1)
			this.right = new Node(data, data.getRightNodeID(id),this);
	
	}
	public int getSiblingID(int id){
		return (id == left.id) ?  right.id : left.id;
	}
	public void getDepth(){
		getDepth(this, 0);
	}
	public void getDepth(Node node, int d){
		node.depth = d;
		if(node.left!=null)
			getDepth(node.left,d+1);
		if(node.right!=null)
			getDepth(node.right,d+1);
	}
	public Node getNode(int id){
		Node temp=null;
		if(this.id==id)
			return this;
		else{
			if(left!=null)
			if(left.getNode(id)!=null)
				return left.getNode(id);
			if(right!=null)
			if(right.getNode(id)!=null)
				return right.getNode(id);
		}
		return null;
	}
	public int getHeight(){
		int height = 0;
		height = getHeight(this, height);
		return height;
	}
	public int getHeight(Node n, int height){
		if(n.left != null){
			int leftHeight = getHeight(n.left,height+1);
			int rightHeight = getHeight(n.right,height+1);
			if(height < leftHeight)
				height = leftHeight;
			if(height < rightHeight)
				height = rightHeight;
		}
		return height;
	}
	int getDegree(){
		int temp=0;
		if(left!=null)
			temp++;
		if(right!=null)
			temp++;
		return temp;
	}
	String getType(){
		if(parent ==null)
			return "root";
		else if(left==null && right ==null)
			return "leaf";
		else
			return "internal node";
	}
	@Override
	public String toString(){
		String tmp = "";
		tmp += "node" + id;
		if(parent==null){
			tmp += ": parent = -1";
			tmp += ", sibling = -1";
		}else{
			tmp += ": parent = " + parent.id;
			tmp += ", sibling = "+ parent.getSiblingID(id);
		}
		
		tmp += ", degree = " + getDegree();
		tmp += ", depth = "+ this.depth;
		tmp += ", height = "+ getHeight();
		tmp += ", " + getType();
		return tmp;
	}
}
class TempNodeData{
	//ArrayList<Integer> leftIDList = new ArrayList<Integer>();
	//ArrayList<Integer> rightIDList = new ArrayList<Integer>();
	HashMap<Integer,Integer> mapLeftID = new HashMap<Integer,Integer>();
	HashMap<Integer,Integer> mapRightID = new HashMap<Integer,Integer>();
	public TempNodeData(Scanner scan){
		while(scan.hasNext()){
			int key = scan.nextInt();
			mapLeftID.put(key,scan.nextInt());
			mapRightID.put(key,scan.nextInt());
		}
	}
	public int keyOfRoot(){
		int index = 0;
		for(int i=0; i<mapLeftID.size(); i++)
			if(!mapLeftID.containsValue(i) && !mapRightID.containsValue(i)){
				index = i;
				break;
			}
		return index;
	}
	public int getLeftNodeID(int nodeID){
		return mapLeftID.get(nodeID);
	}
	public int getRightNodeID(int nodeID){
		return mapRightID.get(nodeID);
	}
}
class NodeData{
	public Integer id;
	public int left;
	public int right;
	public NodeData(int i, int r, int l){
		id = i;
		right = r;
		left = l;
	}
	public boolean isLeaf(){
		return (left==-1 && right == -1);
	}

}
/*
abstract class Node {
	protected Integer id;
	protected Integer leftID;
	protected Integer rightID;
	public Node(int id, int lid, int rid){
		this.id = id;
		leftID = lid;
		rightID = rid;
		
	}
	public void operation() {
		System.out.println("This is Node.");
	}
	public void connectTree(Node node, Node[] node){
		
	}
	public void add(Node component){
		throw new UnsupportedOperationException();
	}
	
	public void remove(Node component){
		throw new UnsupportedOperationException();	
	}
	
	public Node getChild(int i){
		return null;
	}
	@Override
	public String toString(){
		return id.toString(); 
	}
}

class Leaf extends Node{
	public Leaf(int id){
		super(id);
	}
	@Override
	public void operation() {
		System.out.println(id + ":This is Leaf.");
	}
}

class Internal extends Node{
	private List<Node> nodes = new ArrayList<Node>();
	public Internal(int id){
		super(id);
	}
	@Override
	public void operation() {
		System.out.println(id + ":This is Composite.");
		for(Node node : nodes){
			node.operation();
		}
	}
	
	@Override
	public void add(Node node){
		nodes.add(node);
	}
	
	@Override
	public void remove(Node node){
		nodes.remove(node);
	}
	
	@Override	
	public Node getChild(int i){
		return nodes.get(i);
	}
}*/