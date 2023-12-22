import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int m=scan.nextInt();
		int cnt=0;
		while(m-->0) {
			int a=scan.nextInt();
			cnt+=a;
		}
		if(n-cnt>=0) System.out.println(n-cnt);
		else System.out.println("-1");
	}

}
