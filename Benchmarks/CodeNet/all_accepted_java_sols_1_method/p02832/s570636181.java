import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a[] = new int[n];

		for(int i=0;i<n;i++) {
			a[i]=scan.nextInt();
		}
		scan.close();
		int point =0;
		int cnt=0;
		int check=1;
		for(int i=0;i<n;i++) {
			if(check==a[i]) {
				cnt+=i-point;
				point=i+1;
				check+=1;
			}
		}
		if(point!=n) cnt+=n-point;

		if(check==1)System.out.println("-1");
		else System.out.println(cnt);
	}
}