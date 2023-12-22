import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdin = new Scanner( System.in);
		int n=0,a=0,T=0,ans=1;
		double XX=Double.MAX_VALUE;
		n=stdin.nextInt();
		T=stdin.nextInt();
		a =stdin.nextInt();
		for(int i=1;i<=n;i++){
			double ave=0;
			int H=stdin.nextInt();
			ave=T-H*0.006;
			double X=ave-a;
			if(XX*XX>X*X){
				XX=X;
				ans=i;
			}
		}
		System.out.print(ans);
	}
}


