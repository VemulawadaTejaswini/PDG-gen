import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			double x1, y1, x2, y2, x3, y3, x4, y4, a1, a2;
			x1 = sc.nextDouble();
			y1 = sc.nextDouble();
			x2 = sc.nextDouble();
			y2 = sc.nextDouble();
			x3 = sc.nextDouble();
			y3 = sc.nextDouble();
			x4 = sc.nextDouble();
			y4 = sc.nextDouble();
			if((x2 - x1) != 0){
				a1 = (y2 - y1) / (x2 - x1);
			}else{
				a1 = 0;
			}
			if((x4 - x3) != 0){
				a2 = (y4 - y3) / (x4 - x3);
			}else{
				a2 = 0;
			}
			if ( a1 == a2) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}