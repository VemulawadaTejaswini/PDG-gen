import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		int count = 0;

		for(int i=2 ; i<n ; i++) {
			if(s.charAt(i-2)=='A' && s.charAt(i-1)=='B' && s.charAt(i)=='C') {
				count++;
			}
		}
		System.out.print(count);
		sc.close();
	}
}