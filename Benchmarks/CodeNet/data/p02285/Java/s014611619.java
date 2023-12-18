
import java.util.*;


public class Main{ 

	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int operationNum = scan.nextInt();
		BinarySearchTree tree = new BinarySearchTree();
		scan.nextLine();
		for(int i=0; i<operationNum; i++)
			tree.operation(scan);
		// ArrayList<BinarySearchTreeNode> list = 
		//  tree.inOrderConnect(new ArrayList<BinarySearchTreeNode>());

	}

}
class BinarySearchTree{
	private BinarySearchTreeNode root=null;
	public BinarySearchTree(){
		//root = new BinarySearchTreeNode();
	}
	public void operation(Scanner sc){
		String op = sc.next();
		if(op.equals("print"))
			print();
		else if(op.equals("find")){
			if(root.find(Integer.parseInt(sc.next()))!=null)
				System.out.println("yes");
			else
				System.out.println("no");
		}else if(op.equals("delete"))
			delete(Integer.parseInt(sc.next()));
		else
			insert(Integer.parseInt(sc.next()));		
	}
	public void insert(int key){
		if(root==null)
			root = new BinarySearchTreeNode(key);
		else
			root.insertNode(key);
	}
	public void print(){
		ArrayList<BinarySearchTreeNode> list = new ArrayList<BinarySearchTreeNode>();
		keyOrderToString(this.root.inOrderConnect(list));
		list.clear();
		keyOrderToString(this.root.preOrderConnect(list));
	}
	void delete(int key){
		root.delete(key);
	}
	private static void keyOrderToString(ArrayList<BinarySearchTreeNode> list){
		for(Iterator<BinarySearchTreeNode> iter = list.iterator(); iter.hasNext();)
			System.out.print( new StringBuilder().append(" ").append(iter.next().getKey()));
		System.out.println("");	
	}

}



class BinarySearchTreeNode{
	protected int key;
	public BinarySearchTreeNode parent = null;
	public BinarySearchTreeNode LeftChild = null;
	public BinarySearchTreeNode RightChild = null;
	public BinarySearchTreeNode(int key){
		this.key = key;
	}
	public BinarySearchTreeNode(int key, BinarySearchTreeNode parent){
		this.key = key;
		this.parent = parent;
	}
	void delete(){
		delete(this.key);
	}
	public void setChildByKey(int key, BinarySearchTreeNode n){
		if(LeftChild.getKey()==key)
			LeftChild = n;
		else
			RightChild = n;
	}
	public void delete(int key){
		 BinarySearchTreeNode target = find(key);
		 	if(target.LeftChild == null && target.RightChild == null){
		 		target.parent.setChildByKey(target.getKey(), null);
		 	}else if(target.LeftChild!=null && target.RightChild==null){
		 		target.LeftChild.parent = target.parent;
		 		target.parent.setChildByKey(target.getKey(), target.LeftChild);
		 	}else if(target.LeftChild==null && target.RightChild!=null){
		 		target.RightChild.parent = target.parent;
		 		target.parent.setChildByKey(target.getKey(), target.RightChild);
		 	}else{//????????????
		 		BinarySearchTreeNode nextKey = findMin();
		 		target.key = nextKey.getKey();
		 		nextKey.delete();
		 	}
	}
	BinarySearchTreeNode findMin(){
		if(LeftChild==null)
			return this;
		else
			return LeftChild.findMin();
	}
	public BinarySearchTreeNode find(int key){
		if(this.key == key)
			return this;
		if(key < this.key && LeftChild!=null)
			return LeftChild.find(key);
		else if(key > this.key && RightChild!=null)
			return RightChild.find(key);
		else
			return null;
	}
	public boolean findNode(int key){
		if(this.key == key)
			return true;
		if(key < this.key && LeftChild!=null)
			return LeftChild.findNode(key);
		else if(key > this.key && RightChild!=null)
			return RightChild.findNode(key);
		else
			return false;
	}
	void insertNode(int key){
		if(key < this.key){
			if(this.LeftChild ==null)
				this.LeftChild = new BinarySearchTreeNode(key, this);
			else
				this.LeftChild.insertNode(key);
			return;
		}else{
			if(this.RightChild ==null)
				this.RightChild = new BinarySearchTreeNode(key, this);
			else
				this.RightChild.insertNode(key);
			return;
		}
	}
	public ArrayList<BinarySearchTreeNode> preOrderConnect(ArrayList<BinarySearchTreeNode> list){
		list.add(this);
		if(LeftChild!=null)
			LeftChild.preOrderConnect(list);
		if(RightChild!=null)
			RightChild.preOrderConnect(list);
		return list;
	}
	public ArrayList<BinarySearchTreeNode> inOrderConnect(ArrayList<BinarySearchTreeNode> list){
		if(LeftChild!=null)
			LeftChild.inOrderConnect(list);
		list.add(this);
		if(RightChild!=null)
			RightChild.inOrderConnect(list);
		return list;
	}	
	public int getKey(){
		return this.key;
	}

}