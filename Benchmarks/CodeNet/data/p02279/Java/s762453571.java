import java.util.Scanner;
class Node{
	int depth=0,parent=-1,i,id,k;
	int[] c;
	public Node(int Id,int K,int[] C){
		int i;
		id=Id;
		k=K;
		c=C;
		for(i=0;i<k;i++) {

		}
	}
	public void Show() {
		int i;
		System.out.print("node "+id+": parent = "+parent+", depth = "+depth+", ");
		if(parent==-1) {
			System.out.print("root, [");
		}else if(k>0) {
			System.out.print("internal node, [");
		}else {
			System.out.print("leaf, [");
		}
		for(i=0;i<k;i++) {
			System.out.print(c[i]);
			if(i<k-1) {
				System.out.print(", ");
				}
		}
			System.out.println("]");
	}
}
public class Main {
	static Node[] node=new Node[100000];
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i,j,id,n,k;
		n=scan.nextInt();
		for(i=0;i<n;i++) {
			id=scan.nextInt();
			k=scan.nextInt();
			int[] c=new int[k];
			for(j=0;j<k;j++) {
				c[j]=scan.nextInt();
			}
			node[id]=new Node(id,k,c);
		}
		for(i=0;i<n;i++) {
			for(j=0;j<node[i].k;j++) {
				node[node[i].c[j]].parent=node[i].id;
				node[node[i].c[j]].depth=node[i].depth+1;
			}
		}
		for(i=0;i<n;i++) {
			node[i].Show();
		}
		scan.close();
	}
}
