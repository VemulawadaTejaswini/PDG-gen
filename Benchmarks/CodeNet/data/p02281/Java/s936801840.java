import java.util.Scanner;
public class Main{
    static tree[] wd;
	public static void main(String[] args) {
	    int x,i,j,n,root = 0,hz;
	// TODO Auto-generated method stub
     Scanner sca = new Scanner(System.in);
     n=sca.nextInt();
     wd=new tree[n];
     int[]checkmap=new int[n+1];
    for(j=0;j<n;j++){
    	x=sca.nextInt();
	if(j==0)root=x;
	wd[x]=new tree(x);
	for(i=0;i<2;i++){
	    hz=sca.nextInt();
	    if(i==0){
            wd[x].setleft(hz);
	    }else{
	    wd[x].setright(hz);
	    }
	    if(hz==-1)hz=n;
	checkmap[hz]=1;
	}
    }
    for(j=0;j<n;j++){
	if(checkmap[j]!=1)root=j;
    }
    chain(root,-1);
    System.out.println("Preorder");
    preorder(root);
    System.out.println("");
    System.out.println(" \nInorder");
    inorder(root);
    System.out.println("");
    System.out.println(" \nPostorder");
    postorder(root);
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
    public static void postorder(int nd){
	if(wd[nd].getleft()!=-1)postorder(wd[nd].getleft());
	if(wd[nd].getright()!=-1)postorder(wd[nd].getright());
	System.out.print(" "+wd[nd].getnode());
    }
    public static void chain(int chi,int p){
	int i;
	wd[chi].setpar(p);
	if(wd[chi].getdeg()==0)return;
	if(wd[chi].getleft()!=-1) chain(wd[chi].getleft(),chi);
	if(wd[chi].getright()!=-1)chain(wd[chi].getright(),chi);
	}
}
class tree{
    int node,par,n,i,degree=0,sibling,depth,height;
    int left,right;
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
    public void setpar(int p){
	par=p;
    }
    public int getpar(){
	return par;
    }
    public int getdeg(){
	return degree;
    }
    
}

