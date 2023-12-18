import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double r = sc.nextDouble();
		System.out.printf("%08f %08f", r * r * Math.PI, 2 * Math.PI * r);
	}
}