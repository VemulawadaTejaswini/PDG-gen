import java.util.Scanner;
class Main{


	static char[][] map;

	static long[][] c;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		int n = sc.nextInt();
		int[] a = new int[n+1];
		int[] b = new int[n];

		for(int i = 0;i < n+1;i++){
			a[i] = sc.nextInt();	
		}
		for(int i = 0;i < n;i++){
			b[i] = sc.nextInt();
		}
		long ans = 0;
		long sup = 0;
		long calc = 0;
		for(int i = 0;i < n;i++){
			calc = a[i];
			if(sup > 0){
				calc -= sup;
			}
			if(calc < 0){				//あまり分で全部倒した時
				sup = b[i];
				ans += a[i];
			}else{
				calc -= b[i];
				if(calc <= 0){			//あまり+i番目の勇者の力で全部倒した時
					sup = -calc;
					ans += a[i];
				}else{
					sup = 0;
					ans += a[i]- calc;
				}
			}
			
			//System.out.println("sup " + sup);
			
		}
		
		if(a[n] - sup > 0){
			ans += sup;
			
		}else{
			ans += a[n];
		}
		System.out.println(ans);
		
		
		
		
		
		
	}
	static boolean check(int[] cc){
		for(int i = 0;i < cc.length-1;i++){
			if(cc[i] > cc[i+1]){
				return false;
			}
		}
		return true;
	}



	static int gcd(int a,int b){				//最大公約数を返す
		if(b == 0){
			return a;
		}else{
			return gcd(b, a%b);
		}
	}
	static long gcd(long a,long b){
		if(b == 0){
			return a;
		}else{
			return gcd(b, a%b);
		}
	}



	static long lcm (long a, long b) {
		long g = gcd(a,b);
		return a/g*b;
	}




}



class Pair implements Comparable{
	int from;
	int end;
	@Override
	public int compareTo(Object other) {
		Pair otherpair = (Pair)other;

		return   end- otherpair.end;
	}








}




