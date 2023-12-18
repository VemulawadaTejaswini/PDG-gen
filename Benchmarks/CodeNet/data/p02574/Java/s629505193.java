
import java.util.Arrays;
import java.util.Random;
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
	static String solveNaive(int A[]){
		int g = gcd(A[0] , A[1]);
		for(int i = 2 ; i < A.length ; ++i){
			g = gcd(g , A[i]);			
		}
		if(g != 1){
			return "not coprime";
		}
		for(int i = 0 ; i < A.length ; ++i){
			for(int j = i + 1 ; j < A.length ; ++j){
				g = gcd(A[i] , A[j]);
				if(g != 1){
					return "setwise coprime";					
				}
			}
		}
		return "pairwise coprime";
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
			if(a == 1){
				continue;
			}
			if(ps[a] == 1){
				return "setwise coprime";
			}
			ps[a] = 1;
		}
		System.out.println(ps[-1]);
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
		/*
		Random rand = new Random();
		for(int rep = 0 ; rep < 1000 ; ++rep){
			int A[] = new int[4];
			for(int i = 0 ; i < A.length ; ++i){
				A[i] = rand.nextInt(1000000) + 1;
			}
			String x = solve(A);
			String y = solveNaive(A);
			if(!x.equals(y)){
				System.out.println(Arrays.toString(A));
				System.out.println(x+" "+y);
			}else{
//				System.out.println(Arrays.toString(A));
//				System.out.println(x+" "+y);				
			}
		}*/
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
