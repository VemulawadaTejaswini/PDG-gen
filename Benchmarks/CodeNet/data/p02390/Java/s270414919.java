import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int h = n / 3600;
		n = n % 3600;
		int m = n /60;
		int s = n % 60;
		System.out.println(h + ":" + m + ":" + s);
	}
}
