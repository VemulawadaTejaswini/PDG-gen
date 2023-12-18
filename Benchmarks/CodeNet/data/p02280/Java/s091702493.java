import java.io.*;
import java.util.*;

public class Main{
	public static int count = 0;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] node = new int[n];
		int[] degree = new int[n];
		int[] parent = new int[n];
		int[] depth = new int[n];
		int[] height = new int[n];
		int[] sibling = new int[n];
		int sum = 0;
		int[][] childnode = new int[n][2];
		int depthmax = 0;

		for (int i = 0; i<n ;  i++) {
			String[] line = (br.readLine()).split(" ");
			int index = Integer.parseInt(line[0]);
			node[index] = index;
			childnode[index][0] = Integer.parseInt(line[1]);
			childnode[index][1] = Integer.parseInt(line[2]);
			sum = sum + i;
			if (childnode[index][0] != -1) {
				sum -= childnode[index][0];
				sum -= childnode[index][1];
				sibling[childnode[index][0]] = childnode[index][1];
				sibling[childnode[index][1]] = childnode[index][0];
				parent[childnode[index][0]] = node[index];
				parent[childnode[index][1]] = node[index];
				degree[index] = 2;
				height[index]++;
				height[parent[index]]++;

			}else{
				degree[index] = 0;
			}

			
		}
		for (int i = 0 ; i<n ; i++ ) {
			if (childnode[i][0] != -1) {
				
				if (degree[childnode[i][0]] == 2 && degree[childnode[i][1]] == 2) {
					height[i]--;
				}
			}

			if (sum == node[i]) {
				sibling[i] = -1;
				parent[i] = -1;
				for (int j = 0; j<childnode[i].length ; j++ ) {
					depthset(node,depth,parent,childnode,childnode[i][j]);
				}
			}
		}

		StringBuilder sb = createStringBuilder(node,parent,sibling,degree,depth,height);

		System.out.print(sb);
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
					for (int j = 0; j<childnode[i].length ; j++ ) {
						depthset(node,depth,parent,childnode,childnode[i][j]);
					}
				}
			}
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