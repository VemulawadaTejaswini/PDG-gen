import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static String ans="Yay!";
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Map<Long,Integer>map=new HashMap<>();
		int n=5;
		int a[]=new int[n];
		//String s=sc.next();
		//int m=sc.nextInt();
		//int a=sc.nextInt();
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		Arrays.sort(a);
		if(a[4]-a[0]>k)ans=":(";
		System.out.println(ans);
	}
}
