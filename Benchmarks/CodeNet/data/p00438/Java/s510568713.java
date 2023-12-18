import java.util.Arrays;
import java.util.Scanner;


public class Main{

	static Scanner sc = new Scanner(System.in);
	static boolean flag[][] = new boolean[16][16];
	static int sum[][] = new int[16][16];
	static int a, b, n, p, q;

	public static void main(String[] args) {
		
		while(init()){
			solve();
		}

	}	

	public static boolean init(){
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		if(a == 0 && b == 0) return false;

		for(int i = 0; i < a; i++){
			Arrays.fill(flag[i], false);
		}

		n = sc.nextInt();

		for(int i = 0; i < n; i++){
			p = sc.nextInt();
			q = sc.nextInt();

			flag[p-1][q-1] = true;
			sum[p-1][q-1] = 0;
		}

		flag[0][0] = true;
		sum[0][0] = 1;
		for(int i = 1; i < a; i++){
			if(flag[i][0] == false){
				flag[i][0] = true;
				sum[i][0] = sum[i-1][0];
			}
		}
		for(int i = 1; i < b; i++){
			if(flag[0][i] == false){
				flag[0][i] = true;
				sum[0][i] = sum[0][i-1];
			}
		}

		return true;
	}

	public static void solve(){

		for(int i = 1; i < a; i++){
			for(int j = 1; j < b; j++){
				if(flag[i][j] == false){
					flag[i][j] = true;
					sum[i][j] = sum[i-1][j] + sum[i][j-1];
				}
			}
		}

		System.out.println(sum[a-1][b-1]);

	}

}