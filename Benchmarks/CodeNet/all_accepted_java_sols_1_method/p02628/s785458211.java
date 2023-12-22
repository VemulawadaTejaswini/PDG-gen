import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt(), choo = sc.nextInt();
		int[] x=new int[n];
		for(int i=0;i<n;i++)
			x[i] = sc.nextInt();
		long sum = 0;
		Arrays.sort(x);
		for(int i=0;i<choo;i++)
			sum+=x[i];
		System.out.println(sum);
	}
}
