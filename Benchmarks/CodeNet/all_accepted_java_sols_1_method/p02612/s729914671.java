import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t = n / 1000 + 1;
		n = (t * 1000) - n;
		if(n == 1000){
			n = 0;
		}
		System.out.println(n);
	}
}