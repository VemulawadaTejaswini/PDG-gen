import java.awt.Point;
import java.util.Scanner;

public class Main{

	static final Scanner s=new Scanner(System.in);

	public static void main(String args[]){
		System.out.printf("%.5f",Point.distance(s.nextInt(),s.nextInt(),s.nextInt(),s.nextInt()));
	}
}