import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		Random random = new Random(1);
		int n,i;
		n=sc.nextInt();
		int a[]=new int[n];
		
//		int e[]=new int[100000];
//		for(i=0;i<100000;i++){
//			e[i]=random.nextInt(1000);
//		}
		
		for(i=0;i<n;i++) a[i]=sc.nextInt();
		Arrays.sort(a);
		boolean f=false;
		for(i=0;i<n;i++){
			if(f) System.out.print(" ");
			System.out.print(a[i]);
			f=true;
		}
		System.out.println();
	}
}