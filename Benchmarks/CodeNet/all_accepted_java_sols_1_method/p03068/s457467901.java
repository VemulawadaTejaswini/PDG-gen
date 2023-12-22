import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, k, i;
		String s;
		char kk;
		n = sc.nextInt();
		s = sc.next();
		k = sc.nextInt();
		char[] sArray = s.toCharArray();
		kk = sArray[k - 1];
		for( i = 0; i < n; i++) {
			if(sArray[i] != kk) {
				sArray[i] = '*';
			}
			System.out.print(sArray[i]);
		}
		System.out.println();
		sc.close();
	}
}