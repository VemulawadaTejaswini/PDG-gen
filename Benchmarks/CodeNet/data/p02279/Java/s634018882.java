import java.util.Scanner;

class Node {
	private int parent;
	private int depth;
	private String type;
	private int childnum;
	private int[] child;
	
	Node(int d,int p){
		depth=d; parent=p; 
	}
	
	void setChildnum(int childnum){
		this.childnum=childnum;
		child=new int[childnum];
	}
	
	int getChildnum(){ return childnum; }
	
	void setChild(int x,int idx){
		child[idx]=x;
	}
	
	int getChild(int idx){ return child[idx]; }
	
	void setType(){
		if(parent==-1)
			type="root";
		else if(childnum==0)
			type="leaf";
		else 
			type="internal node";
	}
	
	int getParent(){ return parent; }
	
	void setParent(int p){ parent=p; }
	
	int getDepth(){ return depth; }
	
	void setDepth(int d){ depth=d; }
	
	String getType(){ setType(); return type; }
	
	void printChild(){
		
		System.out.print("[");
		
		for(int i=0;i<childnum;i++){
			if(i==childnum-1)
				System.out.print(child[i]);
			else 
				System.out.print(child[i] +", ");
		}
		
		System.out.println("]");
		
	}

}

class Main {
	
	static int getRoot(Node[] a,int n){
		for(int i=0;i<n;i++){
			if(a[i].getParent() == -1)
				return i;
		}
		return 0;
	}
	
	static void setdepth(Node[] a,int root){
		int c=a[root].getChildnum();
		for(int i=0;i<c;i++){
			int t=a[root].getChild(i);
			a[t].setDepth( a[root].getDepth()+1 );
			setdepth(a,t);
		}
		return;
	}
	
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		
		int n=scan.nextInt();
		Node[] a=new Node[n];
		
		for(int i=0;i<n;i++)
			a[i]=new Node(0,-1);
		
		for(int i=0;i<n;i++){
			int x=scan.nextInt(); int y=scan.nextInt();
			a[x].setChildnum(y);
			for(int j=0;j<y;j++){
				int z=scan.nextInt();
				a[x].setChild(z,j);
				a[z].setParent(x);
			}
		}
		
		int root=getRoot(a,n);
		setdepth(a,root);
		
		for(int i=0;i<n;i++){
			System.out.print("node "+i+": parent = "+a[i].getParent()+", "+"depth = "+a[i].getDepth()+", "+a[i].getType()+", ");
			a[i].printChild();
		}
			
		
	}
}
