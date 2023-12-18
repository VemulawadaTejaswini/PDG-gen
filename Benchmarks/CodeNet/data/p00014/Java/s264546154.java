import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int d,s;

		while (sc.hasNextInt()) {
			s = 0;
			d = sc.nextInt();
			for(int i = 1; i < 600 / d ; i++){
				s += (i * d) * (i * d) * d;
			}
			System.out.println(s);
		}
	}

}