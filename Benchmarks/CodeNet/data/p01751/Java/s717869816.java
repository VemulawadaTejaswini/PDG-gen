import java.util.*;
public class Main {
	static String S;
	static int p;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int nowtime = 0;
		boolean ans = false;
		int i = 0;
		for(; i < 100000; i++) {
			nowtime += a;
			if(60 * i + c <= nowtime && 60 * i + c >= nowtime - a) {
				ans = true;
				break;
			}
			nowtime += b;
		}
		if(ans) {
			System.out.println(60 * i + c);
		}
		else {
			System.out.println("NA");
		}
	}

}