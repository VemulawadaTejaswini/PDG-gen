import java.util.Scanner;
import java.util.Arrays;
public class Main {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int N=sc.nextInt();
		int[] a=new int[N];
		int i,alice=0,bob=0;
		for(i=0;i<N;i++) {
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		for(i=N-1;i>=0;i--) {
			if(N%2==0) {
				if(i%2!=0)alice+=a[i];
				else bob+=a[i];
			}else {
				if(i%2==0)alice+=a[i];
				else bob+=a[i];
			}
		}
		System.out.println(alice-bob);
	}
}
