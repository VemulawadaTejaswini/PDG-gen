import java.util.Scanner;
class Main{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double x1, x2, y1, y2;
		double range;
		
		x1 = input.nextInt();
		y1 = input.nextInt();
		x2 = input.nextInt();
		y2 = input.nextInt();
		
		range = Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2);
		System.out.println(Math.sqrt(range));
	}
}