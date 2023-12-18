import java.util.Scanner;
public class Main{
    static tree[] wd;
    static int root =-1;
	public static void main(String[] args) {
	    int i=0,j,n;
	    String x;
	// TODO Auto-generated method stub
     Scanner sca = new Scanner(System.in);
     n=sca.nextInt();
     wd=new tree[n];
    for(j=0;j<n;j++){
       x=sca.next();
    	if(x.equals("insert")){
	    wd[i]=new tree(sca.nextInt());
	    insert(i);
	    i++;
	 }
    	if(x.equals("print")){
    	    inorder(root);
    	    System.out.println("");
    	    preorder(root);
    	    System.out.println("");  		
    	}
    }
   }
    public static void preorder(int nd){
	System.out.print(" "+wd[nd].getnode());
	if(wd[nd].getleft()!=-1)preorder(wd[nd].getleft());
	if(wd[nd].getright()!=-1)preorder(wd[nd].getright());
    }
    public static void inorder(int nd){
	if(wd[nd].getleft()!=-1)inorder(wd[nd].getleft());
	System.out.print(" "+wd[nd].getnode());
	if(wd[nd].getright()!=-1)inorder(wd[nd].getright());
    }
    public static void insert(int data){//NIL->-1
     int y=-1,x=root;//parent of x
     while(x!=-1){
    	y=x;
    	if(wd[data].getnode()<wd[x].getnode()){
    		x=wd[x].getleft();
    	}else{
    		x=wd[x].getright();
    	}
    }
     if (y==-1){//it is root
    	 root=data;
     }else if(wd[data].getnode()<wd[y].getnode()){
    	 wd[y].setleft(data);
     }else{
    	 wd[y].setright(data);
     }
    }
}
class tree{
    int node,par,n,i,degree=0;
    int left=-1,right=-1;
    tree(int node){
	this.node=node;
    }
    public int getnode(){
	return node;
    }
    public void setleft(int c){
	left=c;
	if(left!=-1) degree++;
    }
    public int getleft(){
	return left;
    }
    public void setright(int c){
	right=c;
	if(right!=-1) degree++;
    }
    public int getright(){
	return right;
    }
}

