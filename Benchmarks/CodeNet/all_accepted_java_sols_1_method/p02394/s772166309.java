import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	    
		int W = sc.nextInt();
		int H = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int r = sc.nextInt();
		
//		int W = 5;
//		int H = 4;
//		int x = 2;
//		int y = 2;
//		int r = 1;
		
		if (((r <= x) && (x <= W-r)) && ((r <= y) && (y <= H - r))){
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}