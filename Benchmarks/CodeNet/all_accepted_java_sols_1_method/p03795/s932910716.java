import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int x = 800 * N;
		int y = 0;
		if(N>=15){
			int num = N/15;
			y = 200 * num;
		}
		int cost = x - y;
		System.out.println(cost);
	}

}
