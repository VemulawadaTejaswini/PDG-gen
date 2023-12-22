
import java.util.Scanner;
//
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
		double a =sc.nextInt();
		double b =sc.nextInt();
		int ans =-1;
		
		for (double d=1;d<=10000;d++) {
			int ai =(int)(0.08*d);
			int bi =(int)(0.1*d);
			if (ai==a&&bi==b) {
				ans = (int)(d);
				break;
			}
		}
		System.out.println(ans);
		
		//━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
		}
		//----------------------------------------
		//メソッド置き場
		
		//----------------------------------------
	}