import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int flg=0;
		int n = scan.nextInt();
		for(int i=1;i<=n;i++) {
			flg=0;
			if(i%3==0) {
				System.out.print(" "+i);
				flg=1;
			}
			if(i%10==3 && flg==0) {
				System.out.print(" "+i);
			}
			System.out.println();
		}
		scan.close();
	}
}
