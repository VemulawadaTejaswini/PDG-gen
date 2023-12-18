
import java.util.Scanner;

public class Main {
	static int gcd(int x , int y){
		if(x < y){
			return gcd(y , x);			
		}
		while(y > 0){
			int r = x % y;
			x = y;
			y = r;
		}
		return x;
	}
	static String solve(int A[]){
		int g = gcd(A[0] , A[1]);
		for(int i = 2 ; i < A.length ; ++i){
			g = gcd(g , A[i]);			
		}
		if(g != 1){
			return "not coprime";
		}
		int ps[] = new int[1000001];
		for(int a : A){
			if(ps[a] == 1){
				return "setwise coprime";
			}
			ps[a] = 1;
		}
		for(int i = 2 ; i <= 1000 ; ++i){
			int p = 0;
			for(int j = i ; j < ps.length ; j += i){
				p += ps[j];
			}
			if(p >= 2){
				return "setwise coprime";				
			}
		}
		return "pairwise coprime";
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[] = new int[N];
		for(int i = 0 ; i < N ; ++i){
			A[i] = sc.nextInt();
		}
		String ret = solve(A);
		System.out.println(ret);
	}
}
