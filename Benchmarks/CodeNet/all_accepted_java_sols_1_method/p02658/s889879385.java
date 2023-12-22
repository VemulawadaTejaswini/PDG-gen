import java.util.Scanner;
public class Main {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long a[]=new long[n];
		long ans=1;
		long x=(long)(Math.pow(10, 18));
		for(int i=0;i<n;i++) {
			a[i]=sc.nextLong();
			if(a[i]==0) {
				ans=0;
			}
			if(a[i]>x) {
				ans=-1;
			}
		}
		if(ans!=0&&ans!=-1) {
				for(int i=0;i<n;i++) {
					if(Math.log10(ans)+Math.log10(a[i])<18.5) {
					ans*=a[i];
					if(ans>x) {
						ans=-1;
						break;
					}
					}
					else {
						if(Math.log(ans)+Math.log10(a[i])>18) {
							ans=-1;
							break;
						}
					}
			}
		}
				System.out.println(ans);
	}
}
