import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		int hina;
		int han = 0;
		while(han == 0){
			if(x == 0 && y == 0){
				han = 1;
				break;
			} else if(x > y){
				hina = x;
				x  =   y;
				y = hina;
			}
		    System.out.println(x + " " + y);
			x = scan.nextInt();
			y = scan.nextInt();
		}
	}
}

