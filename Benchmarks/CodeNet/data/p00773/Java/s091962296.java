import java.util.Scanner;

public class Main{
	static Scanner s=new Scanner(System.in);
	public static void main(String[] __){
		while(true){
			int bef=s.nextInt(),aft=s.nextInt(),sum=s.nextInt();
			if(bef+aft+sum==0)return;
			int res=0;
			for(int i=1;i<=sum;i++) {
				for(int j=1;j<=sum;j++) {
					int b=(int)(i*(100+bef)/100.0)+(int)(j*(100+bef)/100.0);
					int a=(int)(i*(100+aft)/100.0)+(int)(j*(100+aft)/100.0);
					if(b==sum)
						res=Math.max(res,a);
				}
			}
			System.out.println(res);
		}
	}
}