
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int k=scan.nextInt();
		int h[]=new int[n];
		int cnt=0;
		for(int i=0;i<n;i++) {
			h[i]=scan.nextInt();
			if(k<=h[i])cnt++;
		}
		scan.close();
		System.out.println(cnt);
	}

}