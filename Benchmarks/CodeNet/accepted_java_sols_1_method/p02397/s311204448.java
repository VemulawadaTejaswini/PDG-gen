import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int buf;
			for(;;) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				if(x==0 && y==0) break;

				if(y<x) {
					buf = y;
					y = x;
					x = buf;
				}
				System.out.println(String.format("%d %d", x, y));
			}
		}
	}
}
