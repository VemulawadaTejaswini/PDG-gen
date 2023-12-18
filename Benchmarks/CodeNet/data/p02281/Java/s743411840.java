
import java.util.*;


public class Main{ 

	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		//int numNode = scan.nextInt();
		TreeNodeData data = new TreeNodeData(scan.nextInt());
		//scan.nextLine();
		data.readNodeData(scan);
		AbstractNode root = data.getNodeList();
		root.treeWalk();

	}

}
enum NODETYPE{
	ROOT,INTERNAL,LEAF,LEFTCHILD,RIGHTCHILD
}
class NodeData{
	private int leftID;
	private int rightID;
	private ArrayList<Integer> children;
	private NODETYPE nodeType;
	public NodeData(int l, int r){
		leftID= l;
		rightID = r;
		if(l != -1 && r != -1)
			nodeType = NODETYPE.INTERNAL;
		else if(l == -1 && r == -1)
			nodeType = NODETYPE.LEAF;
		else if(r==-1)
			nodeType = NODETYPE.LEFTCHILD;
		else
			nodeType = NODETYPE.RIGHTCHILD;
	}
	public NODETYPE getType(){
		return nodeType;
	}
	public int getLeftID(){
		return leftID;
	}
	public int getRightID(){
		return rightID;
	}
	@Override
	public String toString(){
		StringBuilder temp = new StringBuilder();
		temp.append(leftID+", ");
		temp.append(rightID+", ");
		temp.append(nodeType+", ");
		return new String(temp);
	}
}

class TreeNodeData{
	int numNode;
	private HashMap<Integer, NodeData> nodeData = new HashMap<Integer, NodeData>();
	public TreeNodeData(int n){
		this.numNode = n;	
	}

	public void readNodeData(Scanner scan){
		for(int i=0; i<numNode; i++){
			int id = scan.nextInt();
			int left = scan.nextInt();
			int right = scan.nextInt();
			NodeData data = new NodeData(left, right);
			nodeData.put(id, data);
			///System.out.println(data);
		}
	}
	private int rootID(){
		ArrayList<Integer> notParent = new ArrayList<Integer>();
		for(int i=0; i<numNode; i++){
			notParent.add(nodeData.get(i).getLeftID());
			notParent.add(nodeData.get(i).getRightID());
		}
		for(int i=0; i<numNode; i++)
			if(!notParent.contains(i))
				return i;
		return -1;
	}
	public AbstractNode getNodeList(){
		return new AbstractNode(rootID(), nodeData);	
	}
}



class AbstractNode implements Comparable<AbstractNode>{
	protected int id;
	protected AbstractNode parent=null;
	protected ArrayList<AbstractNode> children = new ArrayList<AbstractNode>();
	protected AbstractNode LeftChild=null;
	protected AbstractNode RightChild=null;

	public AbstractNode(int id, HashMap<Integer, NodeData> nodeData){
		this.id = id;
		NodeData self = nodeData.get(id);
		if(self.getType()==NODETYPE.LEAF)
			return;
		if(self.getType()!=NODETYPE.RIGHTCHILD){
			AbstractNode temp = new AbstractNode(self.getLeftID(), nodeData);
			temp.setParent(this);
			this.LeftChild = temp;
		}
		if(self.getType()!=NODETYPE.LEFTCHILD){
			AbstractNode temp = new AbstractNode(self.getRightID(), nodeData);
			temp.setParent(this);
			this.RightChild = temp;
		}

	}
	int getDepth(){
		if(parent == null)
			return 0;
		return parent.getDepth()+1;
	}
	String getType(){
		if(parent == null)
			return "root";
		if(LeftChild==null && RightChild==null)
			return "leaf";
		else return "internal node";
	};
	public int getParentID(){
		if(parent == null)
			return -1;
		else
			return parent.getID();
	}
	public void addChild(AbstractNode c){
		children.add(c);
	}
	public int getID(){
		return id;
	}
	public void setParent(AbstractNode p){
		this.parent = p;
	}
	String childrenID(){
		StringBuilder temp = new StringBuilder();
		temp.append("[");
		if(children.size()>0)
		for(int i=0; ; i++){
			temp.append(children.get(i).getID());
			if( i == children.size() - 1 )
				break;
			temp.append(", ");
		}
		temp.append("]");
		return new String(temp);
	}
	public int getHeight(){
		int leftHeight=0;
		int rightHeight=0;
		if(LeftChild==null && RightChild==null)
			return 0;
		if(LeftChild!=null)
			leftHeight = LeftChild.getHeight();
		if(RightChild!=null)
			rightHeight = RightChild.getHeight();
		return Math.max(leftHeight, rightHeight) +1;

	}
	int getDegree(){
		int countDegree = 0;
		if(LeftChild!=null)
			countDegree++;
		if(RightChild!=null)
			countDegree++;	
		return countDegree;
	}
	public int getSiblingID(){
		if(parent!=null)
			return parent.getAnotherChild(this.id);
		return -1;
	}
	public int getAnotherChild(int id){
		if(LeftChild!=null && LeftChild.getID() == id)
			if(RightChild!=null)
				return RightChild.getID();
		if(RightChild!=null && RightChild.getID() == id)
			if(LeftChild!=null)
				return LeftChild.getID();
		return -1;
	}
	public void nodeInfomation(){
		System.out.println(this);
		for(int i=0; i< children.size();i++)
			children.get(i).nodeInfomation();
	}
	public ArrayList<AbstractNode> connectTree(){
		ArrayList<AbstractNode> temp = new ArrayList<AbstractNode>();
		temp.add(this);
		if(LeftChild!=null)
			temp.addAll(LeftChild.connectTree());
		if(RightChild!=null)
			temp.addAll(RightChild.connectTree());
		return 	temp;
	}
	public ArrayList<AbstractNode> depthFirstConnect(
		ArrayDeque<AbstractNode> queue,  ArrayList<AbstractNode> list){
		list.add(queue.removeFirst());
		if(LeftChild!=null){
			queue.addFirst(LeftChild);
			LeftChild.depthFirstConnect(queue, list);
		}
		if(RightChild!=null){
			queue.addFirst(RightChild);
			RightChild.depthFirstConnect(queue, list);
		}
		return list;
	}
	public ArrayList<AbstractNode> breadthFirstConnect(
		ArrayDeque<AbstractNode> queue,  ArrayList<AbstractNode> list){
		list.add(queue.removeLast());
		if(LeftChild!=null)
			queue.addFirst(LeftChild);
		if(RightChild!=null)
			queue.addFirst(RightChild);
		if(LeftChild!=null)
			LeftChild.breadthFirstConnect(queue, list);
		if(RightChild!=null)
			RightChild.breadthFirstConnect(queue, list);
		return list;
	}
	public void treeWalk(){
		System.out.println("Preorder");
		idOrderToString(preOrderConnect(new ArrayList<AbstractNode>()));
		System.out.println("Inorder");
		idOrderToString(inOrderConnect(new ArrayList<AbstractNode>()));
		System.out.println("Postorder");
		idOrderToString(postOrderConnect(new ArrayList<AbstractNode>()));
	}
	public void idOrderToString(ArrayList<AbstractNode> list){
		StringBuilder temp = new StringBuilder();
		for(Iterator<AbstractNode> iter = list.iterator(); iter.hasNext();)
			temp.append(" "+iter.next().getID());
		System.out.println(new String(temp));
	}
	public ArrayList<AbstractNode> inOrderConnect(ArrayList<AbstractNode> list){
		if(LeftChild!=null)
			LeftChild.inOrderConnect(list);
		list.add(this);
		if(RightChild!=null)
			RightChild.inOrderConnect(list);
		return list;
	}	
	public ArrayList<AbstractNode> preOrderConnect(ArrayList<AbstractNode> list){
		list.add(this);
		if(LeftChild!=null)
			LeftChild.preOrderConnect(list);
		if(RightChild!=null)
			RightChild.preOrderConnect(list);
		return list;
	}
	public ArrayList<AbstractNode> postOrderConnect(ArrayList<AbstractNode> list){
		if(LeftChild!=null)
			LeftChild.postOrderConnect(list);
		if(RightChild!=null)
			RightChild.postOrderConnect(list);
		list.add(this);
		return list;
	}

	@Override
	public String toString(){
		StringBuilder temp = new StringBuilder();
		temp.append("node " + this.id);
		temp.append(": parent = " + getParentID());
		temp.append(", sibling = " + getSiblingID());
		temp.append(", degree = " + getDegree());
		temp.append(", depth = " + getDepth());
		temp.append(", height = " + getHeight());
		temp.append(", "  + getType());
		//temp.append(", "   + childrenID());
		return new String(temp);
	}
	@Override
 	public int compareTo(AbstractNode temp) {
		return this.id - temp.getID();
	}
}