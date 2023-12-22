import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int k = sc.nextInt();
		int time = (c - a) * 60 + (d - b);
		if(time < k)
			System.out.println(0);
		else
			System.out.println(time - k);
	}
}