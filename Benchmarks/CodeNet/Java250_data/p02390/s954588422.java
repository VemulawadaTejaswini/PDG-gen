import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		
		int h = x / 3600;
		x %= 3600;
		int m = x / 60;
		int s = x % 60;
		
		System.out.println(h + ":" + m + ":" + s);
	}
}