import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int XA = sc.nextInt();
		int YB = sc.nextInt();
		int YC = sc.nextInt();
		int YD = sc.nextInt();
		int P = sc.nextInt();
		
		XA*=P;
		
		if(P > YC) {
			YB+=YD * (P - YC);
		}
		
		if(YB > XA) {
			System.out.println(XA);
		} else {
			System.out.println(YB);
		}
	}
}