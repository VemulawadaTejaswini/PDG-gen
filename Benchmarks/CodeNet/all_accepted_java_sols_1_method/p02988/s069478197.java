import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int be = sc.nextInt();
		int ans = 0;
		boolean check1 = false, check2 = false;
		for(int i = 1; i < N; i++){
			int ch = sc.nextInt();
			if(be < ch) {
				if(check1 == true) ans++;
				check1 = true;
				check2 = false;
			}else if(be > ch) {
				if(check2 == true) ans++;
				check1 = false;
				check2 = true;
			}else {
				check1 = false;
				check2 = false;
			}
			be  = ch;
		}
		System.out.println(ans);
	}
}