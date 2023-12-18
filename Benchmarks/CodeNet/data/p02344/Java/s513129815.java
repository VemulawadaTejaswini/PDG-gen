

import java.util.Scanner;

public class Main {
	private static final int INF = Integer.MAX_VALUE;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner sc = new Scanner(System.in);
				int n = sc.nextInt();
				int op_num = sc.nextInt();
				String[] op = new String[op_num+1];
				for (int i = 0 ; i < op.length; i++) {
					op[i] = sc.nextLine();
				}
				//get datag
				int[][] data = new int[op_num][];
				for (int i = 1, n1 =0; i<= op_num; i++,n1++) {
					if(op[i].length()== 5) {
						data[n1] = new int[3];
						data[n1][0] = Integer.parseInt((String)op[i].substring(0,1));
						data[n1][1] = Integer.parseInt((String)op[i].substring(2,3));
						data[n1][2] = Integer.parseInt((String)op[i].substring(4,5));
						
					}
					else if(op[i].length()== 7){
						data[n1] = new int[4];
						data[n1][0] = Integer.parseInt((String)op[i].substring(0,1));
						data[n1][1] = Integer.parseInt((String)op[i].substring(2,3));
						data[n1][2] = Integer.parseInt((String)op[i].substring(4,5));
						data[n1][3] = Integer.parseInt((String)op[i].substring(6,7));
					}
				}
				
				//Operate data
				Set2 set = new Set2(n);
				set.makeset();
				for(int i= 0 ;i < data.length;i++ ) {
					if(data[i][0] == 0) {
						set.link(data[i][1], data[i][2],data[i][3]);
						
					}
					else if(data[i][0] == 1){
						int x = data[i][1];
						int y = data[i][2];
						
						if(set.findset(x)== set.findset(y))
							System.out.println(set.we[y] - set.we[x]);
						else 
							System.out.println("?");
					}
				}
	}
}


class Set2{

	int[] rank,parent;
	int n;
	int weight;
	int[] we;
	int index;
	private static final int INF = Integer.MAX_VALUE;
	
	
	public Set2(int n) {
		rank = new int[n];
		parent = new int[n];
		we = new int[n];
		this.n = n;
		makeset();
	}
	
	void makeset() {
		for(int i= 0 ; i< n; i++)
			parent[i] = i;
	}
	
	int findset(int x) {
		int y = 0;
		if (x == parent[x])
			return x;
		else {
			int temp = parent[x];
			parent[x] = findset(parent[x]);
			we[x] += we[temp]; 
			return parent[x];
		}
	}
	
	void link(int x, int y, int z) {
		int a = findset(x);
		int b = findset(y);
		//int c = findset(z);
		
		if(a!=b) {
			parent[b] = a;
			we[b] = we[x] - we[y] + z;
		}
	}
}
