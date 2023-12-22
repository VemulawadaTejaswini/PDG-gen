import java.util.Scanner;

class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int W = scan.nextInt();
		int H = scan.nextInt();
		int x = scan.nextInt();
		int y = scan.nextInt();
		int r = scan.nextInt();
	
		if(0 <= x - r && x + r <= W && 0 <= y -r && y + r <= H){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
	}
}