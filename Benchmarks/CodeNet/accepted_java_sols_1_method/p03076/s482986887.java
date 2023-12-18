import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception {
		Scanner scan=new Scanner(System.in);
		int a[]=new int[5];
		a[0]=scan.nextInt();
		a[1]=scan.nextInt();
		a[2]=scan.nextInt();
		a[3]=scan.nextInt();
		a[4]=scan.nextInt();
		int ans=0;
		for(int i=0;i<5;i++) {
			int k=0;
			int sa=1000000000;
			for(int j=0;j<5;j++) {
				if(a[j]!=0) {
					int l=10-a[j]%10;
					if(sa>l) {
						sa=l;
						k=j;
					}
					if(a[j]%10==0) {
						k=j;
						break;
					}
				}
			}
			if(a[k]%10==0) {
			ans+=a[k];
			}
			else {
				if(i!=4) {
			ans+=(a[k]/10+1)*10;
				}
				else {
					ans+=a[k];
				}
			}
			a[k]=0;
		}
		System.out.println(ans);
	}
}