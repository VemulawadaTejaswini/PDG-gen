import java.util.Scanner;				//長方形の中の円

class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int W = scan.nextInt();
		int H = scan.nextInt();
		int x = scan.nextInt();
		int y = scan.nextInt();
		int r = scan.nextInt();

		if(x >= r && x <= W-r && y >= r && y <= H-r){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}
