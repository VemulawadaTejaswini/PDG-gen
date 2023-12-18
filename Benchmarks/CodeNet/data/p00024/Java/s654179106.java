import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()){
		double speed = scanner.nextDouble();
		double time = speed / 9.8;
		double height = 4.9 * Math.pow(time, 2);
		int floor = (int) Math.ceil((height/5)+1);
		System.out.println(floor);
		}
	}
}