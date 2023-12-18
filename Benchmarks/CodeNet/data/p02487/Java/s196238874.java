import java.util.*;
public class Main {

	static void print_frame(int x) {
		System.out.print("#");
		for(int r = 0; r < (x - 2); r++)
			System.out.print(".");
		System.out.println("#");
	}
	
	static void top_and_bottom(int x) {
		for(int r = 0; r < x; r++)
			System.out.print("#");
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		while(true) {
			int height = stdIn.nextInt();
			int width = stdIn.nextInt();
			if(height == 0 && width == 0) break;
			top_and_bottom(width);
			for(int r = 0; r < height - 2; r++)
				print_frame(width);
			top_and_bottom(width);
			System.out.println();
		}
	}

}