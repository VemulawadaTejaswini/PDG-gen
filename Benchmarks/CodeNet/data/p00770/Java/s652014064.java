import java.util.*;
import java.awt.geom.*;

public class Main{
	boolean [] isPrime;
	int MAX = 1000000,size = 1000 + 2, offset = size / 2 - 1, INF = 1 << 24;
	int [][] data;
	
	private void prime(){
		isPrime = new boolean[MAX + 1];
		Arrays.fill(isPrime, true);
		isPrime[0] = false;
		isPrime[1] = false;
		for(int i = 2; i * 1 <= MAX; i++){
			if(isPrime[i]){
				for(int j = i + i; j <= MAX; j+=i){
					isPrime[j] = false;
				}
			}
		}
	}
	
	private void numArray(){
		data = new int[size][size];
		for(int i = 0; i < size; i++){
			Arrays.fill(data[i], INF);
		}
		int now = 1, posx = offset, posy = offset;
		for(int i = 1;now <= MAX;i++){
			System.out.print("");
			if(i % 2 == 1){
				//right up
				for(int j = 0; j < i && now <= MAX; j++){
					data[posy][posx] = now;
					posx++;
					now++;
				}
				for(int j = 0; j < i && now <= MAX; j++){
					data[posy][posx] = now;
					posy--;
					now++;
				}
			}
			else{
				//left down
				for(int j = 0; j < i && now <= MAX; j++){
					data[posy][posx] = now;
					posx--;
					now++;
				}
				for(int j = 0; j < i && now <= MAX; j++){
					data[posy][posx] = now;
					posy++;
					now++;
				}
			}
		}
	}
	
	public void doit(){
		Scanner sc = new Scanner(System.in);
		prime();
		numArray();
		while(sc.hasNext()){
			int m = sc.nextInt();
			int n = sc.nextInt();
			if((m|n) == 0) break;
			
			int x = -1, y = -1;
			for(int i = 0; i < size; i++){
				for(int j = 0; j < size; j++){
					if(data[i][j] == n){
						y = i;
						x = j;
					}
				}
			}
			int [][] dp = new int[size][size];
			dp[y][x] = 1;
			int max = 1, ind = 0;
			for(int i = y; i < size; i++){
				for(int j = 0; j < size; j++){
					if(i == y && data[i][j] != n) continue;
					if(data[i][j] > m) continue;
					if(dp[i][j] == 0) continue;
					
					if(isPrime[ data[i][j] ]){
						dp[i][j]++;
						if(max < dp[i][j]){
							max = dp[i][j];
							ind = data[i][j];
						}
						else if(max == dp[i][j]){
							if(ind < data[i][j]){
								ind = data[i][j];
							}
						}
					}

					dp[i + 1][j] = Math.max(dp[i + 1][j], dp[i][j]);
					if(j - 1 >= 0){
						dp[i + 1][j - 1] = Math.max(dp[i + 1][j-1], dp[i][j]);
					}
					if(j + 1 < size){
						dp[i + 1][j + 1] = Math.max(dp[i + 1][j + 1], dp[i][j]);
					}
				}
			}
			System.out.println((max-1) + " " + ind);
		}
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}
}