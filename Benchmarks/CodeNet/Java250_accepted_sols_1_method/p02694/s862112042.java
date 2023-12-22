import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long x = sc.nextLong();
		long  dep = 100;
		double rate = 1.01;

		for(int i = 1; i <= 4000; i++) {
			dep *= 1.01;
			if(dep >= x) {
				System.out.println(i);
				break;
			}
		}



	}

}