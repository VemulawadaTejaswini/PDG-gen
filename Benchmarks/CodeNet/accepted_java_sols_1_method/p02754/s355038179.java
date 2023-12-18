
import java.util.Scanner;
//
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
		long n = sc.nextLong();
		long a = sc.nextLong();
		long b = sc.nextLong();
		long blue = n/(a+b)*a;
		long rem = n%(a+b);
		blue += Math.min(a,rem );
		System.out.println(blue);
		
		//━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
		}
		//----------------------------------------
		//メソッド置き場
		
		//----------------------------------------
	}