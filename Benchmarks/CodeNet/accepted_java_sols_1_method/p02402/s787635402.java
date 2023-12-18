import java.util.Arrays;
import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] ary=new int[n];
		for(int i=0; i<ary.length; i++) {
			ary[i]=sc.nextInt();
		}
		Arrays.sort(ary);
		long sum=0;
		for(int i=0; i<ary.length; i++) {
			sum+=ary[i];
		}
		System.out.printf("%d %d %d%n",ary[0],ary[n-1],sum);
	}
	
}

