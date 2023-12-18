import java.util.Scanner;
class Main {
	public static void main(String[] args){
		int x, y, tmp;
		Scanner scn = new Scanner(System.in);
		
		while (true){
			x = scn.nextInt();
			y = scn.nextInt();
			if (x == 0 && y == 0) break;
			if (x > y){
				tmp = x;
				x = y;
				y = tmp;
			}
			System.out.printf("%d %d\n", x, y);
			
		}
		
		scn.close();
	}
}