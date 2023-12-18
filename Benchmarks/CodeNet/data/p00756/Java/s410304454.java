import java.util.*;

@SuppressWarnings("unchecked")
public class Main {
	int n, max;
	int[] c;
	boolean[] f;
	boolean[][] a;
	LinkedList<Integer>[] rem;
	
	
	void remadd(){
		for(int i=0;i<4;i++){
			for(int j=0;j<n;j++){
				if(f[j]==true) continue;
				if(c[j]==i && rem[i].contains(j)==false){
					boolean flag = false;
					for(int k=j-1;k>=0;k--){
						if(f[k]==false && a[j][k]==true){
							flag = true;
							break;
						}
					}
					if(flag==false) rem[i].add(j);
				}
			}
		}	
	}
	
	
	void dfs(){
		boolean flag;
		while(true){
			flag = false;
			for(int i=0;i<4;i++){
				if(rem[i].size()==2 || rem[i].size()==4 || rem[i].size()==6){
					flag = true;
					while(rem[i].size()!=0) f[rem[i].pop()] = true;
				}
			}
			remadd();
			if(flag==false) break;
		}
		
		for(int i=0;i<4;i++){
			if(rem[i].size()==3 || rem[i].size()==5){
				for(int j=0;j<rem[i].size();j++){
					LinkedList<Integer> tmp = new LinkedList<Integer>();
					int t = rem[i].get(j);
					for(int k=0;k<rem[i].size();k++){
						if(k!=j){
							tmp.add(rem[i].get(k));
							f[rem[i].get(k)] = true;
						}
					}
					rem[i].clear();
					rem[i].add(t);
					dfs();
					for(int k=0;k<tmp.size();k++){
						rem[i].add(tmp.get(k));
						f[tmp.get(k)] = false;
					}
					flag = true;
				}
			}
		}
		
		if(flag==false){
			int cnt = 0;
			for(int i=0;i<n;i++){
				if(f[i]==true) cnt++;
			}
			max = Math.max(max, cnt);
		}
	}
	
	
	void solve(){
		Scanner sc = new Scanner(System.in);
		
		while(true){
			n = sc.nextInt();
			if(n==0) break;
			
			f = new boolean[n];
			a = new boolean[n][n];
			c = new int[n];
			rem = new LinkedList[4];
			for(int i=0;i<4;i++) rem[i] = new LinkedList<Integer>();
			
			int[][] b = new int[n][3];
			for(int i=0;i<n;i++){
				for(int j=0;j<3;j++) b[i][j] = sc.nextInt();
				c[i] = sc.nextInt() - 1;
				for(int j=i-1;j>=0;j--){
					if(Math.sqrt((b[i][0]-b[j][0])*(b[i][0]-b[j][0])+(b[i][1]-b[j][1])*(b[i][1]-b[j][1]))<b[i][2]+b[j][2]){
						a[i][j] = true; //jがiの上にのってる
					}
				}
			}
			
			remadd();
			
			max = 0;
			dfs();
			System.out.println(max);
		}
	}
	
	public static void main(String[] args) {
		new Main().solve();
	}	
}