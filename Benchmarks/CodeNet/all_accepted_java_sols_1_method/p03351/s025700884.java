import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();
		sc.close();
		String ans[] = {"Yes", "No"};
		int an = 1;
		if(Math.abs(a - c) <= d) an = 0;
		else if(Math.abs(a - b) <= d && Math.abs(b - c) <= d)
			an = 0;
		
		System.out.println(ans[an]);
	}

}
