import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String s = sc.next();
		int Rcnt = 0;
		int Bcnt = 0;
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == 'R') {
				Rcnt++;
			} else {
				Bcnt++;
			}
		}
		if(Rcnt > Bcnt) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}