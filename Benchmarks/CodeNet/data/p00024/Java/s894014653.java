import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			double v = sc.nextDouble();
			double n = v*v/9.8/10 + 1;
			System.out.println((int)Math.ceil(n));
		}
		sc.close();
	}
}