import java.util.*;

public class Main {
	public static void  main(String[]  args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int x = sc.nextInt();
		int sum = a+b;
		if(x <= sum && x >= a){
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	}
}
