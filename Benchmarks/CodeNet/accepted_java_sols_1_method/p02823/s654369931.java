
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		long x=sc.nextLong();
		long y=sc.nextLong();
		long min=n;
		min=Math.min(y-1, n-x);

		if((y-x)%2==0) {
			min=Math.min(min, (y-x)/2);
		}else {
			if((y-(x-1))%2==1) {
				min=Math.min(min, (x-1)+(y-x)/2);
			}else {
				min=Math.min(min, x+(y-x)/2);
			}
			if(n-(x+(n-y))%2==0) {
				min=Math.min(min, n-y+(y-x)/2);
			}else {
				min=Math.min(min, n-y+1+(y-x)/2);
			}
		}
		System.out.println(min);


	}

}
