import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		String s = sc.next();

		int red=0,blue=0;
		for(int i=0;i<n;i++) {
			if(s.charAt(i)=='R') {
				red++;
			}else {
				blue++;
			}
		}
		if(red-blue>0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}
