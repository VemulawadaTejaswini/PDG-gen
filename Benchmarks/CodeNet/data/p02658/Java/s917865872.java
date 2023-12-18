import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		try {
			long mul=1;
			for(int i=0;i<n;i++) {
				int a=scan.nextInt();
				mul*=a;
			}
			System.out.println(mul);
		}
		catch (Exception e) {
			System.out.println("-1");
		}
	}

}
