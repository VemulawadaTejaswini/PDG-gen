import java.util.*;

public class Main {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int s = in.nextInt() + in.nextInt() + in.nextInt() + in.nextInt();
		int t = in.nextInt() + in.nextInt() + in.nextInt() + in.nextInt();
		System.out.println(Math.max(s, t));
	}
}