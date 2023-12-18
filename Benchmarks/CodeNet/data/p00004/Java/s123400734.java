import java.util.Scanner;


public class Main {
	Scanner sc = new Scanner(System.in);
	
	void run(){
		while(sc.hasNext()){
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = sc.nextInt();
			int e = sc.nextInt();
			int f = sc.nextInt();
			
			double x = (c*e-b*f)/(a*e-b*d);
			double y = (c*d-a*f)/(b*d-a*e);
			System.out.printf("%.3f %.3f", x, y);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}