import java.util.*;

class Node{
	int depth;
	int parent_id;
	public ArrayList<Integer> children;
	
	Node(){
		children = new ArrayList<Integer>();
		parent_id=-1;
	}
	
	public void setParent_id(int parentid){
		this.parent_id=parentid;
	}
	public int getParent_id(){
		return parent_id;
	}
	public void setDepth(int d){
		this.depth=d;
	}
	public int getDepth(){
		return depth;
	}
}

public class Main {
    public static Node[] nodes;
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	int id,num,k,j;
    	int N=sc.nextInt();
    	nodes=new Node[N];
        for(int i=0;i<N;i++){
        	nodes[i]=new Node();
        }
        for(int i=0;i<N;i++){
        	id=sc.nextInt();
        	num =sc.nextInt();
        	for(j=0;j<num;i++){
        		k=sc.nextInt();
        		nodes[id].children.add(k);
        		nodes[k].setParent_id(id);
        	}
        }
        
        for(int i=0;i<N;i++){
        	if(nodes[i].getParent_id()==-1){
        	    calcDepth(i,0);
        	}
        }
        StringBuilder ans = new StringBuilder();
        
        for(int i = 0; i < N; i++){
            ans.append("node ").append(Integer.toString(i)).append(": parent = ").append(Integer.toString(nodes[i].getParent_id()))
            .append(", depth = ").append(Integer.toString(nodes[i].getDepth())).append(", ");
 
            if(nodes[i].getParent_id() == -1){
                ans.append("root, ");
            }else if(nodes[i].children.size() == 0){
                ans.append("leaf, ");
            }else{
                ans.append("internal node, ");
            }
 
            ans.append("[");
            if(nodes[i].children.size() > 0){
                ans.append(Integer.toString(nodes[i].children.get(0)));
                for(k = 1; k < nodes[i].children.size(); k++){
                    ans.append(", ").append(Integer.toString(nodes[i].children.get(k)));
                }
            }
            ans.append("]\n");
        }
        System.out.print(ans.toString());
        
    }
        
    static void calcDepth(int id,int value){
        	nodes[id].setDepth(value);
        	for(int i=0;i<nodes[id].children.size();i++){
        		calcDepth(nodes[id].children.get(i),value+1);
        	}
    }
}
