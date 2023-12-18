import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		long ans=1;
		int flag=0;
		for(int i=0;i<n;i++) {
			long temp=sc.nextLong();
			if(temp==0) {
				System.out.println("0");
				return ;
			}
			ans*=temp;
			if(ans>(long)Math.pow(10, 18) || ans<0) {
				flag=1;
			}
		}
		if(flag==1) System.out.println("-1");
		else System.out.println(ans);
	}
}
