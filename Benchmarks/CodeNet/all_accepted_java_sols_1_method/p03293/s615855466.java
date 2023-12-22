import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		S += S;
		if(S.contains(sc.next())) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}
