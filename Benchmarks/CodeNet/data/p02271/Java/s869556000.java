import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int n=sc.nextInt();
			int[] a=new int[n+1];
			for(int i=0; i<n; i++) {
				a[i]=sc.nextInt();
			}
			int q=sc.nextInt();
			int[] m=new int[q+1];
			for(int i=0; i<q; i++) {
				m[i]=sc.nextInt();
			}
			int[] sum=new int[(1<<n)];
			for(int i=0; i<(1<<n); i++) {
				sum[i]=0;
				for(int j=0; j<n; j++) {
					if((1 & i>>j) == 1) {
						sum[i]+=a[j];
					}
				}
			}
			for(int i=0; i<q; i++) {
				int count=0;
				for(int j=0; j<(1<<n); j++) {
					if(m[i]==sum[j]) {
						count++;
						System.out.println("yes");
						break;
					}
				}
				if(count==0) {
					System.out.println("no");
				}
			}
			

		}
	}
}
