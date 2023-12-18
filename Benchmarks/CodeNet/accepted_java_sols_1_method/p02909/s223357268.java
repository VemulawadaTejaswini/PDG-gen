import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		sc.close();
		String a = "Sunny";
		String b = "Cloudy";
		String c = "Rainy";
		if(S.equals(a)) {
			System.out.println(b);
		}else if(S.equals(b)) {
			System.out.println(c);
		}else {
			System.out.println(a);
		}
	}

}