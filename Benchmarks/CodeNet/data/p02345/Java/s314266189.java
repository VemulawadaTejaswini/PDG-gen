import java.util.Scanner;

class Node{
	int Hcover;
	int Lcover; 
	int min;
	Node parent;
	Node left;
	Node right;
	public Node(){
		parent=null;
		left=null;
		right=null;
	}

	public boolean between(int a){
		return (Lcover<=a)&&(a<=Hcover);
	}
}

public class Main {
	static Node table[]=new Node[100001];

	public static Node cousei(Node n,int l,int h,int m,int LF,int RI){
		Node mob=new Node();
		mob.Hcover=h;
		mob.Lcover=l;
		mob.min=m;
		mob.parent=n;
		if(h>l){
			mob.left=cousei(mob,l, (h+l)/2, m,LF+1,RI);
			mob.right=cousei(mob,(h+l)/2+1, h, m,LF,RI+1);
		}
		if(h==l) table[h]=mob;
		return mob;
	}

	public static int find(Node n,int l,int h){
		if(n.Lcover==l&&n.Hcover==h)return n.min;

		if(n.left.between(l)&&n.left.between(h)){
			return find(n.left, l, n.left.Hcover);
		}else if(n.right.between(l)&&n.right.between(h)){
			return find(n.right, n.right.Lcover, h);
		}else{
			return Math.min(find(n.left, l, n.left.Hcover), find(n.right, n.right.Lcover,h));
		}
	}

	public static void update(Node n,int p,int x,int bef){
		for(Node it=n;it!=null;it=it.parent){
			if(it.min==bef){
				if(it.left.between(p)){
					it.min=Math.min(it.right.min, x);
				}	if(it.right.between(p)){
					it.min=Math.min(it.left.min, x);
				}
			}
		}
	}

	public static void main(String[] args) {
		Node root=new Node();
		int n;
		int q;
		Scanner stdin=new Scanner(System.in);
		n=stdin.nextInt();
		q=stdin.nextInt();
		root.min=(1<<31)-1;
		root.Hcover=n;
		root.Lcover=1;
		root.parent=null;
		root.left=cousei(root,1,(n+1)/2,root.min,0,0);
		root.right=cousei(root,(n+1)/2+1,n,root.min,0,0);
		for(int XXX=0;XXX<q;XXX++){
			int com=stdin.nextInt();
			int x=stdin.nextInt();
			int y=stdin.nextInt();
			x++;
			if(com==0){
				// update
				int m=table[x].min;
				table[x].min=y;
				update(table[x].parent, x, y,m);
			}else{
				// find
				y++;
				System.out.println(find(root, x, y));
			}
		}
		stdin.close();
	}

}