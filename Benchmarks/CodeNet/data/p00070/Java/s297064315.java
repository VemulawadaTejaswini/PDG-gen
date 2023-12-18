import java.util.Scanner;

//Combination of Number Sequences
public class Main{

	static int n, s, c;
	static boolean[] used;
	static int[][] cach;
	
	static void dfs(int k, int sum){
		if(s < sum)return;
		if(n==10&&k==8){
			if(s-sum>162)return;
			int id = 0;
			for(int i=0;i<10;i++)if(!used[i])id|=1<<i;
			c+=cach[id][s-sum];
			return;
		}
		if(k==n){
			if(sum==s)c++;
			return;
		}
		for(int i=0;i<10;i++){
			if(!used[i]){
				used[i] = true;
				dfs(k+1, sum+(k+1)*i);
				used[i] = false;
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		cach = new int[1<<10][163];
		for(int i=0;i<10;i++){
			for(int j=0;j<10;j++){
				if(i==j)continue;
				cach[(1<<i)|(1<<j)][i*9+j*10]++;
			}
		}
		while(sc.hasNext()){
			n = sc.nextInt();
			s = sc.nextInt();
			c = 0;
			used = new boolean[10];
			dfs(0,0);
			System.out.println(c);
		}
	}
}