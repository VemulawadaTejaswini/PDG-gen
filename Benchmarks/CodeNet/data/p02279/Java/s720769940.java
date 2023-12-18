
import java.util.*;

public class Main{ 

	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		//int numNode = scan.nextInt();
		TreeNodeData data = new TreeNodeData(scan.nextInt());
		//scan.nextLine();
		data.readNodeData(scan);
		Tree tree = new Tree(data.getNodeData());
		tree.connectNode();
		//.out.println("scan end");
		tree.treeView();
	}

}
class NodeData{

	private int numChild;
	private ArrayList<Integer> children;
	public NodeData(int n){
		numChild = n;
		children = new ArrayList<Integer>();
	}
	public void addChild(int c){
		children.add(c);
	}
	public boolean isLeaf(){
		return (children.size()==0);
	}
	public Iterator<Integer> getChildren(){
		return children.iterator();
	}
}
class Tree{
	int numNode;
	ArrayList<AbstractNode> tree = new ArrayList<AbstractNode>();
	HashMap<Integer, NodeData> nodeData;
	public Tree(HashMap<Integer, NodeData> nodeData){
		this.nodeData = nodeData;
		numNode = nodeData.size();
		for(int i =0; i<numNode ;i++ ){
			if(nodeData.get(i).isLeaf())
				tree.add(new Leaf(i));
			else
				tree.add(new InternalNode(i));
		}
	}
	public void connectNode(){
		for(int i=0; i<numNode; i++){
			for(Iterator<Integer> iter = nodeData.get(i).getChildren(); iter.hasNext();){
				int childId = iter.next();
				tree.get(i).addChild(tree.get(childId));
				tree.get(childId).setParent(tree.get(i));
			}
		}
	}
	public void treeView(){
		for(int i=0; i<numNode; i++)
			System.out.println(tree.get(i));
	}
}
class TreeNodeData{
	int numNode;
	private HashMap<Integer, NodeData> nodeData = new HashMap<Integer, NodeData>();
	int rootID;
	//

	public TreeNodeData(int n){
		this.numNode = n;
		//for(int i=0; i<numNode; i++)
		//	nodes.put(i, new Node(i));	
	}
	public HashMap<Integer, NodeData> getNodeData(){
		return nodeData;
	}
	public void readNodeData(Scanner scan){
		ArrayList<Integer> notParent = new ArrayList<Integer>();
		for(int i=0; i<numNode; i++){
			int id = scan.nextInt();
			int numChild = scan.nextInt();
			NodeData data = new NodeData(numChild);
			for(int j=0; j<numChild; j++){
				int childID = scan.nextInt();
				data.addChild(childID);
				notParent.add(childID);
			}
			nodeData.put(id, data);
		}
		for(int i=0; i<numNode; i++)
			if(!notParent.contains(i)){
				rootID = i;
				//System.out.println("root : "+ i);
				break;
			}
	}
	/*public void <AbstractNode> getNodeList(){
	ArrayList<AbstractNode> tree = new ArrayList<AbstractNode>();
		for(int i =0; i<nodeData.size() ; i++ ){
			if(nodeData.get(i).isLeaf())
				tree.add(new Leaf(i));
			else
				tree.add(new InternalNode(i));
		}		
	} */
}


class Leaf extends AbstractNode{
	public Leaf(int n){
		super(n);
	}
	@Override 
	public void addChild(AbstractNode c){
		return;
	}
	@Override 
	String getType(){
		return "leaf";
	}

}
class Root extends AbstractNode{
	public Root(int n){
		super(n);
	}
	@Override 
	public void addChild(AbstractNode c){
		children.add(c);
	}
	@Override 
	String getType(){
			return "root";
	}
}
class InternalNode extends AbstractNode{
	public InternalNode(int n){
		super(n);
	}
	@Override 
	public void addChild(AbstractNode c){
		children.add(c);
	}
	@Override 
	String getType(){
		if(parent==null)
			return "root";
		else
			return "internal node";
	}
}
abstract class AbstractNode{
	protected int id;
	protected AbstractNode parent;
	protected ArrayList<AbstractNode> children = new ArrayList<AbstractNode>();
	abstract public void addChild(AbstractNode c);
	//abstract int getDepth(AbstractNode n);
	abstract String getType();
	public AbstractNode(int id){
		this.id=id;
	}
	public int getID(){
		return id;
	}
	public void setParent(AbstractNode p){
		this.parent = p;
	}
	public int getParentID(){
		return (parent==null)? -1 : parent.getID();
	}
	int getDepth(AbstractNode n){
		if(n.parent==null)
			return 0;
		else
			return getDepth(n.parent)+1;
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
	@Override
	public String toString(){
		StringBuilder temp = new StringBuilder();
		temp.append("node " + this.id);
		temp.append(": parent = " + getParentID());
		temp.append(", depth = " + getDepth(this));
		temp.append(", "  + getType());
		temp.append(", "   + childrenID());
		return new String(temp);
	}
}