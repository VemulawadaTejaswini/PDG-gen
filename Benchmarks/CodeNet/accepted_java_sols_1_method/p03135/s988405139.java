import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double t = sc.nextInt(),x = sc.nextInt();
		double time = t / x;
		System.out.println(time);
	}
}