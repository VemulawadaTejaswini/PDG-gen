import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			while(sc.hasNext()) {
				double v = sc.nextDouble();
				double t = v / 9.8;
				double y = 4.9 * t * t;
				int N = 1;
				while(true) {
					if(5 * N - 5 >= y) {
						System.out.println(N);
						break;
					}
					N++;
				}
			}
		}
	}
}

