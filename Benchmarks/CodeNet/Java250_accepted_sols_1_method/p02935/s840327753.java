import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		double a[] = new double[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		double ans=a[0];	
		for(int i=1;i<n;i++){
			ans+=a[i];
			ans/=2;
		}
		System.out.println(ans);
	}
}