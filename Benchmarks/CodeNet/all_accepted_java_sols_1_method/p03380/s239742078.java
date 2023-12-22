import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		long a[]=new long[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextLong();
		}
		Arrays.sort(a);
		System.out.print(a[n-1]+" ");
		double x=(double)(a[n-1])/2;
		double d=Double.MAX_VALUE;
		long second=a[0];
		for(int i=0;i<n;i++) {
			if(Math.abs(x-a[i])<d) {
				d=Math.abs(x-a[i]);
				second=a[i];
			}
			else {
				System.out.println(second);
				break;
			}
		}
		
		
	}

}
