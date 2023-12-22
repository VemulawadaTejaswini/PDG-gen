import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		scan.close();
		int cnt = 0;
		for(int i = 1; i <=n; i++) {
			int digit = String.valueOf(i).length();
			if(digit % 2 == 1) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}

}