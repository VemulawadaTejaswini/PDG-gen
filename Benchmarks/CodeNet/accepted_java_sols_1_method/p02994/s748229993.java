import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N =sc.nextInt();
		int L =sc.nextInt();
		int[] a = new int[N];
		int sum=0;
		int check=L;
		
		for(int i=0;i<N;i++) {
			a[i]=i+L;
			if(Math.abs(check)>Math.abs(a[i])) {
				check=Math.abs(a[i]);
				sum=i;
			}
		}
		a[sum]=0;
		sum=0;
		for(int i=0;i<N;i++) {
			sum+=a[i];
		}
		
		System.out.print(sum);
		
		sc.close();
	}
}
