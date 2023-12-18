import java.util.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args){
		int W = scan.nextInt();
		int H = scan.nextInt();
		int x = scan.nextInt();
		int y = scan.nextInt();
		int r = scan.nextInt();
		boolean flag;
		if(x + r > W){
			flag = false;
		} else if(x - r < 0){
			flag = false;
		} else if(y + r > H){
			flag = false;
		} else if(y - r < 0){
			flag = false;
		} else{
			flag = true;
		}
		System.out.println(flag? "Yes" : "No");
	}
}