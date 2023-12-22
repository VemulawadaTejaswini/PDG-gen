import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int a[]=new int[N];
		for(int i=0;i<N;i++) {
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		int b=400;
		int c=0;
		int j=0;
		for(int i=1;i<=8;i++) {
			while(j<N) {
				if(a[j]<i*b&&a[j]>=(i-1)*b) {
					c++;
					break;
				}
				else if(a[j]>=i*b) {
					break;
				}
				j++;
			}
		}
		int d=0;
		j=N-1;
		while(j>=0&&a[j]>=3200) {
			d++;
			j--;
		}
		System.out.println(Math.max(c, 1)+" "+(c+d));
		
	}
}
