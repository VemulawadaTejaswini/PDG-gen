import java.util.Scanner;


class Main {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		while (true){
			int x = input.nextInt();
			int y = input.nextInt();
			
			if (x == 0 && y == 0)break;
			
			if (x > y){
				int dam = x;
				x = y;
				y = dam;
			}
			
			System.out.println(x + " " + y);
		}
	}
}