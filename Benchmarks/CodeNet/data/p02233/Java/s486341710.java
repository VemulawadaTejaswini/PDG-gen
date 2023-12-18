import java.io.*;
import java.util.*;

public class Main{
	public static int count = 0;
	public static int depthmax = 0;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] fib = new int[n+1];
		fib[0] = 1;
		fib[1] = 1;
		for (int i = 2; i < (n+1) ; i++ ) {
			fib[i] = fib[i-2] + fib[i-1]; 
		}
		System.out.println(fib[n]);
	}


	public static StringBuilder createStringBuilder(int[] node,int[] parent,int[] sibling,int[] degree,int[] depth,int[] height){

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i<node.length ; i++ ) {
			sb.append("node ").append(node[i]).append(": ");
			sb.append("parent = ").append(parent[i]).append(", ");
			sb.append("sibling = ").append(sibling[i]).append(", ");
			sb.append("degree = ").append(degree[i]).append(", ");
			sb.append("depth = ").append(depth[i]).append(", ");
			sb.append("height = ").append(height[i]).append(", ");
			sb.append(root(parent[i],degree[i])).append("\n");
		}


		return sb;

	}


	public static void heightset(int[] depth,int[] height,int maxdepth){
		for (int i = 0; i<depth.length ; i++ ) {
			height[i] = maxdepth - depth[i];
		}
	}

	public static void depthset(int[] node,int[] depth,int[] parent,int[][] childnode,int child){
		for (int i = 0; i<node.length ; i++ ) {
			if (node[i] == child) {
				depth[i] = (depth[parent[i]]+1);
				if (childnode[i][0] >= 0) {
					depthset(node,depth,parent,childnode,childnode[i][0]);
				}
				if (childnode[i][1] >= 0) {
					depthset(node,depth,parent,childnode,childnode[i][1]);
				}
			}
			depthmax = Math.max(depthmax,depth[i]);
		}


	}


	public static void parentdepthset(int[] node,int[] parent,int[] depth,int[][] childnode,int parentnode,int child){
		for (int i = 0; i<node.length ; i++ ) {
			if (node[i] == child) {
				parent[i] = parentnode;
				depth[i] = (depth[parentnode]+1);
				if (childnode[i].length > 0) {
					for (int j = 0; j<childnode[i].length ; j++ ) {
						parentdepthset(node,parent,depth,childnode,node[i],childnode[i][j]);
					}
				}
			}

		}


	}
	public static String root(int parent,int degree){
		if (parent == -1) {
			return "root";
		}else if (degree == 0) {
			return "leaf";
		}else{
			return "internal node";
		}
	}


	public static StringBuilder toStringBuilder(int[] a){
		StringBuilder sb = new StringBuilder();
		sb.append(a[0]);
		for (int i = 1; i<a.length ; i++ ) {
			sb.append(" ").append(a[i]);
		}

		return sb;
	}

	public static void countingSort(int[] a,int[] b,int max){
		int[] c = new int[max+1];

		for (int j = 0; j<a.length ; j++ ) {
			c[a[j]]++;
		}

		for (int i = 1; i<=max ; i++ ) {
			c[i] = c[i] + c[i-1];
		}

		for (int j = a.length-1; j>=0 ; j-- ) {
			b[c[a[j]]-1] = a[j];
			c[a[j]]--;
		}


	}
}