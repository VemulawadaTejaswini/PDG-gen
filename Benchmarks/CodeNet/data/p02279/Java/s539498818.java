import java.util.*;

public class Main {
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		node p[]=new node[n];
		for (int i=0;i<n;i++){
			int id=sc.nextInt();
			int num=sc.nextInt();
			int a[]=new int[num];
			for (int j=0;j<num;j++){
				a[j]=sc.nextInt();
			}
			p[id]=new node(id,num,a);
		}
		for (int i=0;i<n;i++){
			for (int j=0;j<p[i].num;j++){
				p[p[i].child[j]].parent=i;
				p[i].type="internal node";
			}
		}
		for (int i=0;i<n;i++){
			if (p[i].parent==-1){
				p[i].type="root";
				setdepth(p,i);
				break;
			}
		}
		for(int i=0;i<n;i++){
			StringBuffer sb=new StringBuffer();
			sb.append("node "+i+":parent = "+p[i].parent+", depth = "+p[i].depth+", "+p[i].type+", [");
			for (int j=0;j<p[i].num;j++){
				sb.append(p[i].child[j]);
				if (j<p[i].num-1) sb.append(", ");
			}
			sb.append("]");
			System.out.println(sb.toString());
		}
	}
	static public void setdepth(node p[],int n){
		for (int i=0;i<p[n].num;i++){
			p[p[n].child[i]].depth=p[n].depth+1;
			setdepth(p,p[n].child[i]);
		}
	}
}

class node{
	int id;
	int num;
	int child[];
	int parent;
	int depth;
	String type;
	public node(int i,int n,int c[]){
		this.id=i;
		this.num=n;
		this.child=c;
		this.depth=0;
		this.type="leaf";
		this.parent=-1;
	}
}