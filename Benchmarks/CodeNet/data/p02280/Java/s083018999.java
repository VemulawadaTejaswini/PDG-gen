import java.io.*;
import java.util.*;
public class Main{
    public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int numNodes = scan.nextInt();
		TempNodeData tempNodeData = new TempNodeData(scan);
		//Node root = new Node(tempNodeData, tempNodeData.keyOfRoot(), null);
		Root root = new Root(tempNodeData);
		Iterator<AbsNode> iter = root.treeIter();
		while(iter.hasNext())
			System.out.println(iter.next());
	}
}
abstract class AbsNode implements Comparable<Object>{
	int id;
	int height = -1;
	AbsNode parent=null;
	AbsNode left=null;
	AbsNode right=null;
	@Override
	public int compareTo(Object other) {
		AbsNode n = (AbsNode) other;
		return this.id - n.id; 
	}
	public int getHeight(AbsNode n){
		int	leftHeight = n.left.getHeight(n.left) + 1;
		int	rightHeight = n.right.getHeight(n.right) + 1;
		return leftHeight > rightHeight ? leftHeight : rightHeight;
	}
	int getDegree(){
		int temp=0;
		if(left!=null)
			temp++;
		if(right!=null)
			temp++;
		return temp;
	}
	int getParentID(){
			return parent.id;
	}
	public int getSiblingID(){
		return parent.getSiblingID(this.id);
	}
	public int getSiblingID(int id){
		if(left == null || right == null)
			return -1;
		return (left.id == id)?
				right.id : left.id;
	}
	int getDepth(){
		return parent.getDepth()+1;
	}
	public void treeIter(ArrayList<AbsNode> tree, AbsNode n){
			n.left.treeIter(tree,n.left);
			n.right.treeIter(tree,n.right);
			tree.add(n);
	}
	public Iterator<AbsNode> treeIter(){
		ArrayList<AbsNode> tree = new ArrayList<AbsNode>();
		treeIter(tree, this);
		Collections.sort(tree);
		return tree.iterator();
	}
	abstract String getType();
	@Override
	public String toString(){
		String tmp = "";
		tmp += "node " + id;
			tmp += ": parent = " + getParentID();
			tmp += ", sibling = " + getSiblingID();
		tmp += ", degree = " + getDegree();
		tmp += ", depth = " + getDepth();
		tmp += ", height = "+ getHeight(this);
		tmp += ", " + getType();
		return tmp;
	}
}
class Leaf extends AbsNode{
	public Leaf(int id, AbsNode p){
		this.id = id;
		parent = p;
		this.left = this.right = null;
	}
	@Override
	public int getHeight(AbsNode n){
		return 0;
	}
	@Override
	public void treeIter(ArrayList<AbsNode> tree, AbsNode n){
		tree.add(this);
	}
	@Override
	String getType(){
			return "leaf";
	}
}
class Root extends AbsNode{
	public Root(TempNodeData data){
		this.id = data.keyOfRoot();
		int leftID = data.getLeftNodeID(id);
		this.left = (!data.isLeaf(leftID))?
			new Node(data, leftID, this) : new Leaf(leftID, this);
		
		int rightID = data.getRightNodeID(id);
		this.right = (!data.isLeaf(rightID))?
			new Node(data, rightID, this) : new Leaf(rightID, this);

	}
	@Override
	int getParentID(){
		return -1;
	}
	@Override
	public int getSiblingID(){
			return -1;
	}
	@Override
	String getType(){
			return "root";
	}
	@Override
	int getDepth(){
		return 0;
	}
}
class Node extends AbsNode{
	int depth;
	public Node(TempNodeData data, int id, AbsNode p){
		this.id = id;
		parent = p;
		int leftID = data.getLeftNodeID(id);
		this.left = (!data.isLeaf(leftID))?
			new Node(data, leftID, this) : new Leaf(leftID, this);
		
		int rightID = data.getRightNodeID(id);
		this.right = (!data.isLeaf(rightID))?
			new Node(data, rightID, this) : new Leaf(rightID, this);
	}

	/*
	public int getDepth(){
		getDepth(this, 0);
		return this.depth;
	}
	public void getDepth(Node n, int depth){
		if(n.parent==null)
			this.depth = depth;
		else
			getDepth(n.parent, depth+1);
	}*/
	@Override
	String getType(){
			return "internal node";
	}

}
class TempNodeData{
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
	boolean isLeaf(int nodeID){
		return (mapLeftID.get(nodeID) == -1 && mapRightID.get(nodeID) == -1);
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