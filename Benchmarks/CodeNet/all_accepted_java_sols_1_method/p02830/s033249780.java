import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		String s=scan.next();
		String t=scan.next();
		scan.close();

		char[] cs =s.toCharArray();
		char[] ct =t.toCharArray();
		for(int i=0;i<n;i++) {
			String x=String.valueOf(cs[i])+String.valueOf(ct[i]);
			System.out.print(x);
		}
		System.out.println();
	}

}