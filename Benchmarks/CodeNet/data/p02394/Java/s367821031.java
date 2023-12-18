import java.util.*;
public class Main{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int W = sc.nextInt();
		int H = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int r = sc.nextInt();
		Boolean inside = true;
		if((x - r) < 0) inside = false;
		if((x + r) > W) inside = false;
		if((y - r) < 0) inside = false;
		if((y + r) > H) inside = false;
		System.out.println(inside ? "Yes" : "No");
	}
}

