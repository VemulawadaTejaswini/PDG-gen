import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		int check=0;
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				if(n==i*j) {
					check=1;
					break;
				}
			}
		}
		System.out.println((check==1)? "Yes":"No");
	}
}