import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A=sc.nextInt();
		double Ad=(double)A;
		int B=sc.nextInt();
		double Bd=(double)B;
		int H=sc.nextInt();
		int M=sc.nextInt();
		sc.close();
		double arg, C;
		arg=(double)H*30.0+(double)M*0.5-(double)M*6.0;
		C=Math.sqrt(Ad*Ad+Bd*Bd-2.0*Ad*Bd*Math.cos(Math.toRadians(arg)));
		System.out.println(C);
	}
}
