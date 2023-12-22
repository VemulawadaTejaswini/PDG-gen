import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String a = sc.next();
		String b = sc.next();

		for(int i =0;i< n;i++) {
			System.out.print(a.substring(i,i+1)+b.substring(i,i+1));
		}
	}
}

