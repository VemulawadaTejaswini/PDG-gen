import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		long[] b = new long[x + 1];
		long[] a = new long[x];
		for (int i = 0; i < x + 1; i++) b[i] = sc.nextLong();
		for(int i = 0;i<x;i++)a[i]=sc.nextLong();
		long output = 0;
		for(int i = 0;i<x;i++) {
			long v = Math.min(a[i],b[i]);
			a[i]-=v;
			b[i]-=v;
			output+=v;
			v=Math.min(a[i],b[i+1]);
			a[i]-=v;
			b[i+1]-=v;
			output+=v;
		}
		System.out.println(output);
		
	}
}
