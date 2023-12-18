import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int d=scan.nextInt();
		scan.close();

		System.out.println((n%(d*2+1)!=0)? n/(d*2+1)+1:n/(d*2+1));
	}
}