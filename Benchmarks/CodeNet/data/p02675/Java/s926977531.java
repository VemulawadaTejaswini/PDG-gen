import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s ;
		if(n % 10 == 3) s = "bon";
		else if(n % 10 == 0 || n % 10 == 1 || n % 10 == 6 || n % 10 == 8) s = "pon";
		else s = "hon";
		System.out.println(s);
	}
}