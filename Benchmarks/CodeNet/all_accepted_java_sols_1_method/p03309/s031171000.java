import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		long[] a=new long[N];
		for(int i=0;i<N;i++){
			a[i]=sc.nextInt()-i-1;
		}

		Arrays.sort(a);
		long b=a[a.length/2];
		
		long sum=0;
		for(long v:a){
			sum+=Math.abs(b-v);
		}
		System.out.println(sum);
	}
}


