import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		long N=sc.nextLong(),A=sc.nextLong(),B=sc.nextLong();
		Long ans=0L;

		ans+=N/(A+B)*A;
		if(N%(A+B)<A) {
			ans+=N%(A+B);
		}else if(N%(A+B)>=A){
			ans+=A;
		}
		System.out.println(ans);

	}
}