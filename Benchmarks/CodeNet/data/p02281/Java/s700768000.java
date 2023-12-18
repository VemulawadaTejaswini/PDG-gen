import java.io.*;
import java.util.*;
public class Main {
	
	static Node tree[];
	static List<Integer> plot;
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		int n=in.nextInt();
		tree=new Node[n]; for(int i=0;i<n;i++)tree[i]=new Node();
		
		for(int i=0;i<n;i++) {
			int id=Integer.parseInt(in.next()),l=Integer.parseInt(in.next()),r=Integer.parseInt(in.next());
			tree[id].left=l; tree[id].right=r;
			if(l!=-1)tree[l].parent=id;
			if(r!=-1)tree[r].parent=id;
		}
		
		plot=new ArrayList<>(); String method[]= {"Preodrer","Inorder","Postorder"};
		int r=0;
		while(tree[r].parent!=-1)r++;
		
		PrintWriter out=new PrintWriter(System.out);
		for(int i=0;i<3;i++) {
			plot.clear();
			if(i==0)Preoder(r);
			else if(i==1)Inoder(r);
			else Postoder(r);
			out.println(method[i]);
			for(int j=0;j<plot.size()-1;j++)out.print(plot.get(j)+" ");
			out.println(plot.get(plot.size()-1));
		}
		out.flush();
	}
	
	static void Preoder(int index) {
		plot.add(index);
		if(tree[index].left!=-1)Preoder(tree[index].left);
		if(tree[index].right!=-1)Preoder(tree[index].right);
	}
	
	static void Inoder(int index) {
		if(tree[index].left!=-1)Inoder(tree[index].left);
		plot.add(index);
		if(tree[index].right!=-1)Inoder(tree[index].right);
	}
	
	static void Postoder(int index) {
		if(tree[index].left!=-1)Postoder(tree[index].left);
		if(tree[index].right!=-1)Postoder(tree[index].right);
		plot.add(index);
	}

}

class Node{
	int parent=-1,left=-1,right=-1;
}

