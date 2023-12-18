import java.util.Scanner;
public class Main {
	void run(){
		Scanner s = new Scanner(System.in);
		double x1 = s.nextDouble();
		double y1 = s.nextDouble();
		double x2 = s.nextDouble();
		double y2 = s.nextDouble();
		double xLen = (x1-x2)*(x1-x2);
		double yLen = (y1-y2)*(y1-y2);
		double ans = Math.sqrt(xLen + yLen);
		System.out.println(ans);
	}
	public static void main(String args[]){
		new Main().run();
	}
}