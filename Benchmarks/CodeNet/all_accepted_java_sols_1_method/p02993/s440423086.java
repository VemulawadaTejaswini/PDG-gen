
import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String[] a = s.split("");
		String ans = "Good";
		for(int i = 1; i < 4; i++) {
			if(a[i-1].equals(a[i])) {
				ans = "Bad";
			}
		}
		System.out.println(ans);
		sc.close();
	}


}
