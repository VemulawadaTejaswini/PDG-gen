import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c = sc.nextInt();
		if(n<=2*c) {
			System.out.println(0);
		}else {
			System.out.println(n-2*c);
		}
	}
}