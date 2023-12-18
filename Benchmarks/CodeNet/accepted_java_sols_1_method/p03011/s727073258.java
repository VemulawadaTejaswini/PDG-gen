import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int P=scan.nextInt();
		int Q=scan.nextInt();
		int R=scan.nextInt();
		System.out.println(P+Q+R-(Math.max(Q,Math.max(P, R))));

	}

}
