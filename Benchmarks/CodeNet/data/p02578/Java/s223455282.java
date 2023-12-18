
import java.util.*;
class Main {
 
	//最大公約数・最小公倍数（セットで使う）
static int gcd (int a, int b) {return b>0?gcd(b,a%b):a;}
static int lcm (int a, int b) {return a*b/gcd(a,b);}
   //整数かどうかを判定する
 static boolean isInteger(double number){return Math.ceil(number) == Math.floor(number); }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
 
		int n = sc.nextInt();
		int[] a = new int[n];

		for(int i=0;i<n;i++)a[i] = sc.nextInt();

		Long ans = 0l;
		for(int i=1;i<n;i++){
			if(a[i-1] > a[i]){
				ans += a[i-1] - a[i];
			}
		}
		System.out.println(ans);
	}
}
