import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String s = scan.next();
		int x = 0;
		int max = x;
		for(int i = 0; i < n; i++) {
			if(s.charAt(i) == 'I') {
				x++;
			} else {
				x--;
			}
			if(max < x) {
				max = x;
			}
		}
		System.out.println(max);
	}
}