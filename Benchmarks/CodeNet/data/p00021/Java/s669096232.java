import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	void doIt() {
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			double x1 = sc.nextDouble();
			double y1 = sc.nextDouble();
			double x2 = sc.nextDouble();
			double y2 = sc.nextDouble();
			double x3 = sc.nextDouble();
			double y3 = sc.nextDouble();
			double x4 = sc.nextDouble();
			double y4 = sc.nextDouble();
			if(x1 == x2){
				if(x3 == x4)System.out.println("YES");
				else System.out.println("NO");
			}else if(x3 == x4)System.out.println("NO");
			else{
				double ABk = (y2 - y1)/(x2 - x1);
				double CDk = (y4 - y3)/(x4 - x3);
				if(ABk == CDk) System.out.println("YES");
				else System.out.println("NO");
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().doIt();
	}
}