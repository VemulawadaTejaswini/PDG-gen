import java.util.*;

public class Main {
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n == 0) break;
			int w = sc.nextInt();
			int h = sc.nextInt();
			int [][] data = new int[h+1][w+1];
			
			for(int i = 0; i < n;i++){
				int x = sc.nextInt();
				int y = sc.nextInt();
				data[y][x] = 1;
			}
			int s = sc.nextInt();
			int t = sc.nextInt();
			
			for(int i = 1; i <= h; i++){
				for(int j = 1; j <= w; j++){
					data[i][j] = data[i][j-1] + data[i][j];
				}
			}
			
			int max = 0;
			for(int i = 1; i <= h; i++){
				for(int j = 1; j <= w; j++){
					if(j + s - 1 > w) continue;
					int sum = 0;
					for(int k = 0; k < t; k++){
						if(i + k > h) break;
						sum += data[i + k][j + s-1] - data[i + k][j-1];
					}
					max = Math.max(max, sum);
				}
			}
			System.out.println(max);
		}
	}
	
	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}
}