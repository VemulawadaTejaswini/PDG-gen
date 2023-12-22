import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
	public static void main (String[] args){
		Scanner sc=new Scanner(new InputStreamReader(System.in));
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++) a[i]=sc.nextInt();
		sc.close();
		for(int i=n-1;i>0;i--) System.out.print(a[i]+" ");
		System.out.println(a[0]);
	}
}