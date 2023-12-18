import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		double x1=s.nextDouble(),y1=s.nextDouble(),x2=s.nextDouble(),y2=s.nextDouble();
		s.close();
		System.out.println(Math.hypot(x2-x1, y2-y1));
	}
}
