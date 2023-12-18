import java.util.Scanner;

public class Main{
	static int[] max = new int[11];
	static int[] min = new int[11];
	public static boolean judge(int n, int s){
		if( s < min[n] || s > max[n] ){
			return false;
		}
		return true;
	}

	public static int factorial(int n){
		if( n == 0 ){
			return 1;
		}
		return n*factorial(n-1);
	}
	
	public static int possible(int n, int s, boolean[] used){
		int count = 0;
		if( !judge(n, s) ){
			return 0;
		}
		if( n == 1 ){
			if( used[s] ){
				return 0;
			} else {
			/*	used[s] = true;
				for(boolean bl : used){
					System.out.print(bl + " ");
				}
				System.out.println();
				used[s] = false;*/
				return 1;
			}
		}
		for(int i = 0; i < 10; i++){
			if( !used[i] ){
				used[i] = true;
				count += possible(n-1, s-i, used);
				used[i] = false;
			}
		}
		return count;
	}
	
/*	public static void solve(int n, int s, boolean[] used, int count, boolean flag){
		if( !judge(n, s) ){
			return;
		}
		if( n == 1 ){
			if( !used[s] ){
				flag = true;
			}
			return;
		}
				
		for(int i = 0; i < 10; i++){
			if( !used[i] ){
				used[i] = true;
				solve(n-1, s-i, used, count);
				used[i] = false;
			}
		}
		System.out.println(count);
	}*/
		
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		for(int i = 1; i <= 10; i++){
			max[i] = max[i-1] + (10-i);
			min[i] = min[i-1] + (i-1);
		}
		int n = stdIn.nextInt();
		int s = stdIn.nextInt();
		while( n != 0 || s != 0 ){
			boolean[] used = new boolean[10];
			int count = 0;
			System.out.println(possible(n, s, used)/factorial(n));
			n = stdIn.nextInt();
			s = stdIn.nextInt();
		}
	}
}