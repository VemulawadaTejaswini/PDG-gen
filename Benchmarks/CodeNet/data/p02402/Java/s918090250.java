import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] num = new int[n];
		long max=-1000000;
		long min=1000000;
		long sum=0;

		for(int t=0;t<n;t++) {
			num[t]=sc.nextInt();
			if(num[t]<=min)
			{
				min=num[t];}
			if(num[t]>=max) {
				max=num[t];
			}
			sum+=num[t];
			}
		System.out.println(min+" "+max+" "+sum);
	}
}

