import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		String s = "";
		if(n == 25) {
			s = "Christmas";
		}else if(n == 24) {
			s = "Christmas Eve";
		}else if(n == 23) {
			s = "Christmas Eve Eve";
		}else if(n == 22) {
			s = "Christmas Eve Eve Eve";
		}
		System.out.println(s);
	}
}