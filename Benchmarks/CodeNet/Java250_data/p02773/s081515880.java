
import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s[]=new String[n];

		for(int i=0;i<n;i++) {
			s[i]=sc.next();
		}
		Arrays.sort(s);
		int max=1;
		int c=1;
		String h=s[0];
		int b=0;
		int a[]=new int[n];
		for(int i=1;i<n;i++) {

			if(h.equals(s[i])) {
				c++;
			}else {
				max=Math.max(c, max);
				h=s[i];
				a[b]=c;
				b=i;
				c=1;
			}
			if(i==n-1) {
				max=Math.max(c, max);
				a[b]=c;
			}
		}
		for(int i=0;i<n;i++) {
			if(a[i]==max)
				System.out.println(s[i]);
		}


	}

}
