import java.io.*;
import java.util.*;
public class Main{
    public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int numNodes = scan.nextInt();
		TempNodeData tempNodeData = new TempNodeData(scan);
		Node root = new Node(tempNodeData, tempNodeData.keyOfRoot(),null);
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
	int height = -1;
	public Node(TempNodeData data, int id, Node p){
		this.id = id;
		parent = p;
		if(data.getLeftNodeID(id)!=-1)
			this.left = new Node(data, data.getLeftNodeID(id),this);
		if(data.getRightNodeID(id)!=-1)
			this.right = new Node(data, data.getRightNodeID(id),this);
	}
	public int getSiblingID(){
		if(parent == null)
			return -1;
		if(parent.left!=null)
			if(parent.left.id == this.id && parent.right != null)
				return parent.right.id;
		if(parent.right!=null)
			if(parent.right.id == this.id && parent.left != null)
				return parent.left.id;
		return -1;
	}
	int getParentID(){
		if(parent==null)
			return -1;
		else
			return parent.id;
	}
	public void getDepth(Node n, int depth){
		if(n.parent==null)
			this.depth = depth;
		else
			getDepth(n.parent, depth+1);
	}
	public int getDepth(){
		getDepth(this, 0);
		return this.depth;
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
		getHeight(this);
		return this.height;
	}
	public int getHeight(Node n){
		int leftHeight = 0;
		int rightHeight = 0;
		if(n.left==null && n.right==null)
			return n.height = 0;
		if(n.left != null)
			leftHeight = getHeight(n.left) + 1;
		if(n.right != null)
			rightHeight = getHeight(n.right) + 1;
		return n.height =
			 leftHeight > rightHeight ? leftHeight : rightHeight;
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
		tmp += "node " + id;
		/*if(parent==null){
			tmp += ": parent = -1";
			tmp += ", sibling = -1";
		}else{*/
			tmp += ": parent = " + getParentID();
			tmp += ", sibling = "+ getSiblingID();
		//}
		
		tmp += ", degree = " + getDegree();
		tmp += ", depth = "+ getDepth();
		tmp += ", height = "+ getHeight();
		tmp += ", " + getType();
		return tmp;
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