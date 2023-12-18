import java.util.Scanner;
class Main{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double v, y;
		double n;
		
		while (input.hasNext()){
			v = input.nextDouble();
			y = (v * v) / 19.6;
			n = (y + 5) / 5;
			System.out.println((int)Math.ceil(n));
		}
	}
}