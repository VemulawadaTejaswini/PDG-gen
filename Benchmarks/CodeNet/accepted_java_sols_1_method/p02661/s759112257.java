import java.util.*;
import java.io.PrintWriter;
import java.math.*;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		int[] b=new int[n];
		for(int i=0; i<n;i++){
			a[i]=sc.nextInt();
			b[i]=sc.nextInt();
		}
		Arrays.sort(a);
		Arrays.sort(b);
		if(n%2==0){
			System.out.println(b[n/2-1]+b[n/2]-(a[n/2-1]+a[n/2])+1);
		}else{
			System.out.println(b[n/2]-a[n/2]+1);
		}
	}
}
