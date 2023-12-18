import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			int a[]=new int[200];
			int n=sc.nextInt();
			int flag=1,cnt=0;
			for(int i=0;i<n;i++) {
				a[i]=sc.nextInt();
				if(a[i]%2!=0)	flag=0;	
			}
			if(flag==1) {
				do {
					for(int i=0;i<n;i++) {
						a[i]=a[i]/2;
						if(a[i]%2!=0)	flag=0;
					}
					cnt++;
				}while(flag==1);
			}
			System.out.println(cnt);

		}

}