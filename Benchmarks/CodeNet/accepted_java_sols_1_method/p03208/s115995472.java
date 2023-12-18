import java.util.Arrays;
import java.util.Scanner;

class Main {
	public static void main(String[] $) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(),k=sc.nextInt(),min=Integer.MAX_VALUE,count=0;
		int[] a=new int[n];
		for(int i=0;i<n;i++) a[i]=sc.nextInt();
		Arrays.sort(a);
		for(int i=0;i<n;i++) {
			count++;
			if(count>=k) {
				min=Math.min(min, a[i]-a[i-k+1]);
			}
		}
		System.out.println(min);
	}
}

