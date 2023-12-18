import java.util.Scanner;

class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		while(true){
			if(x > y)System.out.println(y + " " + x);
			else System.out.println(x + " " + y);
			x = scan.nextInt();
			y = scan.nextInt();
			if(x == 0 && y == 0)break;
		}
	}
}