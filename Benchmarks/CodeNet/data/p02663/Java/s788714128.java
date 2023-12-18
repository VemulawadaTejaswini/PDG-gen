import java.util.Scanner;

public class Acc2005301{
	public static void main(String[] args){
		int s[]=new int[5];
		int h,h1,h2,okirum,m,m1,m2,k,ans;
		Scanner sc = new Scanner(System.in);
			h1= sc.nextInt();
			m1= sc.nextInt();
			h2= sc.nextInt();
			m2= sc.nextInt();
			k= sc.nextInt();
			h=h2-h1;
			m=m2-m1;
			okirum=m+60*h;
			if(okirum<=k){
				System.out.printf("0");
			}
			else{
				ans=okirum-k;
				System.out.printf("%d",ans);
			}

	}
}
