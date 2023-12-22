import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N =sc.nextInt();
		double sumJ=0;
		double sumB=0;
		
		for(int i=0;i<N;i++) {
			double x = sc.nextDouble();
			String y =sc.next();
			if(y.equals("JPY")) {
				sumJ+=x;
			}
			else {
				sumB+=x;
			}
		}
		
		sumJ+=(sumB*380000);
		System.out.println(sumJ);
		
		sc.close();
	}
}
