import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String s = scan.next();
		scan.close();
		int cnt=1;
		for(int i=1;i<n;i++) {
			if(s.charAt(i)!=s.charAt(i-1))cnt++;
		}
		System.out.println(cnt);
	}
}