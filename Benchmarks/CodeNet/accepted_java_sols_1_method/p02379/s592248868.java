import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			double x1 = sc.nextDouble();
			double y1 = sc.nextDouble();
			double x2 = sc.nextDouble();
			double y2 = sc.nextDouble();
			
			double dx = x1-x2;
			double dy = y1-y2;
			
			System.out.println(Math.sqrt(dx*dx+dy*dy));
		}
	}
}
