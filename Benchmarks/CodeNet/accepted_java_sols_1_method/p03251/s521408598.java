import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner in = new java.util.Scanner(System.in);
		int N = in.nextInt();
		int M = in.nextInt();
		int X = in.nextInt();
		int Y = in.nextInt();
		int maxX = -100;
		int x;
		for(int i=0; i<N; i++) {
			x = in.nextInt();
			if(maxX <= x) {
				maxX = x;
			}
			if(x >= Y) {
				System.out.println("War");
				System.exit(0);
			}
		}
		
		int minY = 100;
		int y;
		for(int i=0; i<M; i++) {
			y = in.nextInt();
			if(minY >= y) {
				minY = y;
			}
			if(y <= X) {
				System.out.println("War");
				System.exit(0);
			}
		}
		if(maxX >= minY) {
			System.out.println("War");
		}else {
			System.out.println("No War");
		}
		
		in.close();
	}
}
