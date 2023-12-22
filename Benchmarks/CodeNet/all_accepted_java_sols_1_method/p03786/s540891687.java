import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner as = new Scanner(System.in);
		int n = as.nextInt();
		long[] a;
		long[] b;
		a = new long[n];
		b = new long[n];
		for(int i=0;i<n;i++){
			b[i] = as.nextLong();
			a[i] = b[i];
		}
		Arrays.sort(a); 
		Arrays.sort(b);
		int l = 0;
		for(int i=0;i<n-1;i++){
			a[i+1]+=a[i];
		}
		for(int i=n-1;i>0;i--){
			if(a[i-1]*2<b[i]){
				l = i;
				break;
			}
		}
		System.out.println(n-l);
	}
}