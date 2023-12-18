import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int v = sc.nextInt();
		int b = sc.nextInt();
		int w = sc.nextInt();
		int t = sc.nextInt();
		if(v < w) {
			System.out.println("NO");
			return;
		}
		if(b < a) {
			if((a-t*v)-(b-w*t)<=0) {
				System.out.println("YES");
				return;
			}
			else {
				System.out.println("NO");
				return;
			}
		}
		if(b > a) {
			if((a+t*v)-(b+w*t)>=0) {
				System.out.println("YES");
				return;
			}
			else {
				System.out.println("NO");
				return;
			}
		}
	}
}