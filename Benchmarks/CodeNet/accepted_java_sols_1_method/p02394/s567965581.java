import java.util.*;

public class Main{
	public static void main(String[] args){
		String input = new Scanner(System.in).nextLine();
		String[] num = input.split("\\s");
		int W = Integer.parseInt(num[0]);
		int H = Integer.parseInt(num[1]);
		int x = Integer.parseInt(num[2]);
		int y = Integer.parseInt(num[3]);
		int r = Integer.parseInt(num[4]);
		if((x - r < 0) || (x + r > W) || (y - r < 0) || ( y + r > H)){
			System.out.println("No");
		} else{
			System.out.println("Yes");
		}
	}
}