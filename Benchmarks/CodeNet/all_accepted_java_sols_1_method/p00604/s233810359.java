import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			int n = sc.nextInt();
			int[] a = new int[n];
			for(int i=0;i<n;i++) a[i] = sc.nextInt();
			Arrays.sort(a);
			for(int i=1;i<n;i++) a[i] = a[i-1] + a[i];
			int sum = 0;
			for(int i=0;i<n;i++) sum+=a[i];
			System.out.println(sum);
		}
	}	
}