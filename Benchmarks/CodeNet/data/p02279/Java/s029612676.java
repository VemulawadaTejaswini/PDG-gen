import java.io.*;
import java.util.*;

public class Main{
	public static int count = 0;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] node = new int[n];
		int[] k = new int[n];
		StringBuilder[] c = new StringBuilder[n];
		int sum = 0;
		int[][] childnode = new int[n][];
		for (int i =0; i<n ; i++ ) {
			c[i] = new StringBuilder();
			sum = sum + i;
		}

		String[] line = new String[n];

		for (int i = 0; i<n ;  i++) {
			line[i] = br.readLine();
			int index = line[i].indexOf(" ");
			node[i] = Integer.parseInt(line[i].substring(0,index));
		}

		for (int i = n-2; i>=0 ; i-- ) {
			for (int j = 0; j<=i ; j++ ) {
				if (node[j] > node[j+1]) {
					int work = node[j];
					node[j] = node[j+1];
					node[j+1] = work;

					String st = line[j];
					line[j] = line[j+1];
					line[j+1] = st;
				}
			}
		}

		for (int i = 0; i<n ; i++ ) {
			String[] str = line[i].split(" ");
			k[i] = Integer.parseInt(str[1]);
			childnode[i] = new int[k[i]];
			if (k[i] == 0) {
				continue;
			}else{
				for (int j = 2; j < (k[i]+2) ; j++) {
					childnode[i][j-2] = Integer.parseInt(str[j]);
					sum -= childnode[i][j-2];
					if (j==2) {
						c[i].append(childnode[i][j-2]);
						
					}else{
						c[i].append(", ").append(childnode[i][j-2]);
					}
				}
			}
		}
		int[] parent = new int[n];
		int[] depth = new int[n];

		for (int i = 0 ; i<n ; i++ ) {
			if (sum == node[i]) {

				parent[i] = -1;
				for (int j = 0; j<childnode[i].length ; j++ ) {
					parentdepthset(node,parent,depth,childnode,node[i],childnode[i][j]);
				}
			}
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i<n ; i++ ) {
			sb.append("node ").append(node[i]).append(": ");
			sb.append("parent = ").append(parent[i]).append(", ");
			sb.append("depth = ").append(depth[i]).append(", ");
			sb.append(root(parent[i],c[i]));
			sb.append(", [" + c[i] + "]\n");
		

		}

		System.out.print(sb);
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
	public static String root(int parent,StringBuilder c){
		if (parent == -1) {
			return "root";
		}else if (c.length() == 0) {
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