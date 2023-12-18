import java.util.Scanner;
public class Main{
	static Scanner sc = new Scanner(System.in);
	static double x[] = new double[3];
	static double y[] = new double[3];
	static double px, py;
	
	public static void main(String[] args) {
		
		while(sc.hasNext()){
			scan();
			double a = (x[2] - x[1]) * (py - y[1]) - (y[2] - y[1]) * (px - x[1]);
			double b = (x[0] - x[2]) * (py - y[2]) - (y[0] - y[2]) * (px - x[2]);
			double c = (x[1] - x[0]) * (py - y[0]) - (y[1] - y[0]) * (px - x[0]);
			
			if((a > 0 && b > 0 && c > 0) || (a < 0 && b < 0 && c < 0)){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}
	}

	static void scan(){
		
		for(int i = 0; i < 3; i++){
			x[i] = sc.nextDouble();
			y[i] = sc.nextDouble();
		}
		px = sc.nextDouble();
		py = sc.nextDouble();
	}
}