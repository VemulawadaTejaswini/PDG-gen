import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long X = sc.nextLong();
		long init = 100;
		int y = 0;
		while(init < X){
			long a = init / 100;
			init += a;
			++y;
		}
		System.out.println(y);
	}
}
