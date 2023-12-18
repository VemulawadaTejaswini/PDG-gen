import java.util.*;

@SuppressWarnings("unchecked")
public class Main {
	int n, max;
	int[] c;
	boolean[] f;
	boolean[][] a;
	
	
	void dfs(){
		boolean flag;
		ArrayList<Integer>[] list = new ArrayList[4];
		
		while(true){
			for(int i=0;i<4;i++) list[i] = new ArrayList<Integer>();
			for(int i=0;i<n;i++){
				flag = false;
				if(f[i]==false){
					for(int j=i-1;j>=0;j--){
						if(f[j]==false && a[i][j]==true) flag = true;
					}
					if(flag==false) list[c[i]].add(i);
				}
			}
			flag = false;
			for(int i=0;i<4;i++){
				if(list[i].size()==2 || list[i].size()==4 || list[i].size()==6){
					for(int j=0;j<list[i].size();j++) f[list[i].get(j)] = true;
					flag = true;
				}
			}
			if(flag==false) break;
		}
		
		for(int i=0;i<4;i++){
			int s = list[i].size();
			if(s==3 || s==5){
				for(int j=0;j<s;j++){
					for(int k=0;k<s;k++){
						if(k!=j) f[list[i].get(k)] = true;
					}
					dfs();
					for(int k=0;k<s;k++){
						f[list[i].get(k)] = false;
					}
				}
			}
		}

		int sum = 0;
		for(int i=0;i<n;i++){
			if(f[i]==true) sum++;
		}
		max = Math.max(max, sum);
	}
	
	
	void solve(){
		Scanner sc = new Scanner(System.in);
		
		while(true){
			n = sc.nextInt();
			if(n==0) break;
			
			f = new boolean[n];
			a = new boolean[n][n];
			c = new int[n];
			
			int[][] b = new int[n][3];
			for(int i=0;i<n;i++){
				for(int j=0;j<3;j++) b[i][j] = sc.nextInt();
				c[i] = sc.nextInt() - 1;
				for(int j=i-1;j>=0;j--){
					if(Math.sqrt((b[i][0]-b[j][0])*(b[i][0]-b[j][0])+(b[i][1]-b[j][1])*(b[i][1]-b[j][1]))<b[i][2]+b[j][2]){
						a[i][j] = true;
					}
				}
			}
			
			max = 0;
			dfs();
			System.out.println(max);
		}
	}
	
	public static void main(String[] args) {
		new Main().solve();
	}	
}