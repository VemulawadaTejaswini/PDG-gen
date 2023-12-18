import java.util.Scanner;


public class Main{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextDouble()) {
			System.out.println(floor(sc.nextDouble()));
		}
		sc.close();
	}
	
	static int floor(double v) {
		return (int) (Math.floor(v * v / 98) + 2);
	}
}