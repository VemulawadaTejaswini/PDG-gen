

import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int op_num = sc.nextInt();
		String[] op = new String[op_num+1];
		for (int i = 0 ; i < op.length; i++) {
			op[i] = sc.nextLine();
		}
		
		//get the data
		int[][] data = new int[op_num][3];
		for (int i = 1, n1 =0; i<= op_num; i++,n1++) {
			String[] Split = op[i].split(" ");
			for (int j= 0 ;j< 3;j++) {
				data[n1][j] = Integer.parseInt(Split[j]);
			}
		}
		
		
		//operate data
		Set set = new Set (n);
		set.makeset();
		for(int i= 0 ;i < data.length;i++ ) {
			if(data[i][0] == 0)
				set.union(data[i][1], data[i][2]);
			else if(data[i][0] == 1){
				if(set.findset(data[i][1]) == set.findset(data[i][2]))
					System.out.println(1);
				else
					System.out.println(0);
			}
		}
		
	}
}

class Set{
	int[] rank,parent;
	int n;
	
	public Set(int n) {
		rank = new int[n];
		parent = new int[n];
		this.n = n;
		makeset();
	}
	
	void makeset() {
		for(int i= 0 ; i< n; i++)
			parent[i] = i;
	}
	
	int findset(int x) {
		if (parent[x] != x) {
			parent[x] = findset(parent[x]);
		}
		return parent[x];
	}
	
	void union(int x,int y) {
		int x_root = findset(x);
		int y_root = findset(y);
		
		if (x_root == y_root)
			return;
		
		if(rank[x_root]<rank[y_root])
			parent[x_root] = y_root;
		else if (rank[y_root]<rank[x_root])
			parent[y_root] = x_root;
		else {
			parent[y_root] = x_root;
			rank[x_root] = rank[x_root]+1;
		}
	}
}
