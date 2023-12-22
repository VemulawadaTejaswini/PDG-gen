import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int S = sc.nextInt();
		int h = S / 3600;
		int t = S % 3600;
		int m = t / 60;
		int s = t % 60;
		System.out.println(h+":"+m+":"+s);
	}
}