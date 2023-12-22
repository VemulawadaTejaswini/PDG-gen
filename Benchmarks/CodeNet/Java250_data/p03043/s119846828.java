import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(), k=sc.nextInt();
		int[] array = new int[n];
		for(int i=0;i<n;i++) {
			double least = (double)k/(i+1);
			least = Math.log(least)/Math.log(2.0);
			for(int j=0;;j++) {
				if(j>=least) {
					array[i]=j;
					break;
				}
			}
		}
		double sum =0.0;
		for(int i=0;i<n;i++) {
			sum += (double)1/power(2,array[i]);
		}
		System.out.printf("%.10f\n",(double)sum/n);
	}

	static int power(int tei, int ruijo) {
		int k=tei;
		if(ruijo==0) return 1;
		if(ruijo==1) return tei;
		for(int i=1;i<ruijo;i++) tei*=k;
		return tei;
	}
}
