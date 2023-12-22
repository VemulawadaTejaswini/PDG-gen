import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
	    int x = scan.nextInt();
	    int l[]=new int[n];
		for (int i = 0; i < n; i++) {
			l[i]=scan.nextInt();
		}
		scan.close();
		int d=0;
		int cnt=1;
		for (int i = 0; i < n; i++) {
			d=d+l[i];
			if(d<=x)cnt++;
		}
		System.out.println(cnt);
	}
}