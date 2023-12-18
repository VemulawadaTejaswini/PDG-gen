import java.util.Scanner;

public class Main {
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args){
		int x = in.nextInt(), y = in.nextInt();
		
		if((0 <= x || y <= 0) && x < y){
			System.out.println(Math.abs(y - x));
		}else if(y < x && ((x < 0 && y < 0) || (0 < x && 0 < y))){
			int ans = Math.abs(Math.abs(x) - Math.abs(y));
			System.out.println(ans + 2);
		}else{
			int ans = Math.abs(Math.abs(x) - Math.abs(y));
			System.out.println(ans + 1);
		}
	}
}