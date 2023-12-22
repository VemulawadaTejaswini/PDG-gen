import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args)
	{
		int n,m,na,na2=0,s,cnt=0,flg=0;
		int a[]=new int[31];
		int i,j;
		int b=0;

		Arrays.fill(a,b);

		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();

		m = sc.nextInt();

		for(i=0;i<n;i++) {

			na = sc.nextInt();

			for(j=0;j<na;j++) {
				s = sc.nextInt();
				a[s]++;
			}
		}

		for(i=1;i<=m;i++) {

			if(a[i]==n) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}