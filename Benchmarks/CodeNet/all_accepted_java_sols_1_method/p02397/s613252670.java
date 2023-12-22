import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		boolean bl = true;
		int tmp;
		while(bl){
			int x = stdIn.nextInt();
			int y = stdIn.nextInt();
			if(x == 0 && y == 0) break;
			if(x > y){
				tmp = x;
				x = y;
				y = tmp;
			}
			System.out.println(x +" "+ y);
		}
	}
}