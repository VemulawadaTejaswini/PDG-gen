import java.io.IOException;
import java.util.Scanner;

public class Main{
	public static void main (String[] args){
		Scanner in = new Scanner(System.in);
		
		int w = in.nextInt();
		int h = in.nextInt();
		int x = in.nextInt();
		int y = in.nextInt();
		int r = in.nextInt();
		
		if(x > r && x < w - r && y > r && y < h - r){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
		
	}
}