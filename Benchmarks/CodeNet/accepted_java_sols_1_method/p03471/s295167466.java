import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Y = sc.nextInt() / 1000;
		for (int x=0; x<=2000; x++) {
			for (int y=0; y<=4000; y++) {
				int z = N - x - y;
				if (z >= 0 && 10*x + 5*y + z == Y) {
					System.out.println(String.format("%d %d %d", x, y, z));
					return;
				}
			}
		}
		System.out.println("-1 -1 -1");
	}
}