import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int a[] = new int[n+2];
		a[0]=0;
		for(int i=1;i<n+1;i++) {
			a[i]=sc.nextInt();
		}
		a[n+1]=0;
		int sum=0;
		for(int i=1;i<n+2;i++) {
			sum+=Math.abs(a[i-1]-a[i]);
		}
		for(int i=1;i<n+1;i++) {
			int num = sum;
			num -=Math.abs(a[i-1]-a[i])+Math.abs(a[i]-a[i+1]);
			num += Math.abs(a[i-1]-a[i+1]);
			System.out.println(num);
		}
	}
}