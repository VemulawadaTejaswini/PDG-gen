import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String ans = "No";
		int jdg = n%28;
		if(jdg == 0) {
			ans = "Yes";
		}else {
			while(jdg >= 3) {
				if(jdg%4 == 0 || jdg%7 == 0) {
					ans = "Yes";
					break;
				}else {
					jdg -= 7;
				}
			}
		}
		System.out.println(ans);
		sc.close();
	}
}
