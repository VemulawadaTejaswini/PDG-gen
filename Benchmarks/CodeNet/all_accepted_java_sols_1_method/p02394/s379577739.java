import java.util.Scanner;

class Main{
	
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		int w = scan.nextInt();
		int h = scan.nextInt();
		int x = scan.nextInt();
		int y = scan.nextInt();
		int r = scan.nextInt();
		
		if((x - r) >= 0 && (y - r) >= 0 && (w - x) >= r && (h - y) >= r){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
		
	}
	
}