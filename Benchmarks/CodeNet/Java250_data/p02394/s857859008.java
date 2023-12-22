import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int w = Integer.parseInt(input.next());
		int h = Integer.parseInt(input.next());
		int x = Integer.parseInt(input.next());
		int y = Integer.parseInt(input.next());
		int r = Integer.parseInt(input.next());
		
		if (x-r >= 0 && x+r <= w) {
			if (y-r >= 0 && y+r <= h) {
				System.out.println("Yes");
			}else{
				System.out.println("No");
			}
		}else{
			System.out.println("No");
			
		}
	}
}