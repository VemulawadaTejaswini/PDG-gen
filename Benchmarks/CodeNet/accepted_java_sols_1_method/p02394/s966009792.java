import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int W,H,x,y,r;

		do{
			W = scan.nextInt();
		}while(!(0 < W && W <= 100));

		do{
			H = scan.nextInt();
		}while(!(0 < W && H <= 100));

		do{
			x = scan.nextInt();
		}while(!(-100 <= x && x <= 100));

		do{
			y = scan.nextInt();
		}while(!(-100 <= y && y <= 100));

		do{
			r = scan.nextInt();
		}while(!(0 < r && r <= 100));

		if((0 <= x-r && x+r <= W) && (0 <= y-r && y+r <= H))	System.out.println("Yes");
		else							System.out.println("No");
	}
}