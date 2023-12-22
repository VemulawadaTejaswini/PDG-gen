import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int k = scan.nextInt();
		int ans = 0;
		for(;0<k;k--) {
			if(a>0) {
				a--;ans++;
			}else if(b>0) {
				b--;
			}else {
				ans--;
			}
		}
		System.out.println(ans);
	}
}