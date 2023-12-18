import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		String t = sc.next();
		String ss = s.substring(0,1);
		String total = ss.concat(t.substring(0,1));

		for(int i = 1; i < n;i++) {
			ss = s.substring(i,i+1);
			total = total.concat(ss);
			total = total.concat(t.substring(i,i+1));
		}

		System.out.println(total);
	}

}