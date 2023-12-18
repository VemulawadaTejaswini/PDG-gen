import java.lang.Math;
import java.util.Scanner;
class Main{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		int x = scanner.nextInt();
		if(1<=x & x<100){
			double y = Math.pow(x,3);
			System.out.println(y);
		}
	}
}
		
