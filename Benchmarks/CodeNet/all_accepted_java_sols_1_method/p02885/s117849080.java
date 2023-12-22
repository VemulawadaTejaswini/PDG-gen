import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int ans = a - b * 2;
		if(ans < 0) {
			ans = 0;
		}
		System.out.println(ans);

	}

}
