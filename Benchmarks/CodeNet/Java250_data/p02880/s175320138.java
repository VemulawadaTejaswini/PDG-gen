import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		boolean flg = false;

		for(int i=1;i<=9;i++) {
			for(int j=1;j<=9;j++) {
			if(n == i*j) {

				flg = true;
			}
			}
		}
		System.out.println(flg?"Yes":"No");
		scan.close();
	}

}
