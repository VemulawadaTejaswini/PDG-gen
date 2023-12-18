import java.util.Scanner;

class Circle{

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int W = scan.nextInt();
		int H = scan.nextInt();
		int x = scan.nextInt();
		int y = scan.nextInt();
		int r = scan.nextInt();
		if(r <= W-x && r <= x && r <= H-y && r <= y){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}

	}
}