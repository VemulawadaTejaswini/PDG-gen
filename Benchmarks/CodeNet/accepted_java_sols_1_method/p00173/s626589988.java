import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws java.io.IOException {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			String n = scan.next();
			int m = scan.nextInt();
			int a = scan.nextInt();
			System.out.println(n + " " + (m+a) + " " + (200*m+300*a));
		}
	}
}