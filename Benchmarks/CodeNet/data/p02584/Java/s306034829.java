import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double X=sc.nextDouble();
		double K=sc.nextDouble();
		double D=sc.nextDouble();
		sc.close();
		while(K>0) {
			if((Math.abs(X+D)<Math.abs(X-D))) {
				X+=D;
			}else {
				X-=D;
			}
			K--;
		}
		System.out.println(Math.abs((int)X));
	}
}
