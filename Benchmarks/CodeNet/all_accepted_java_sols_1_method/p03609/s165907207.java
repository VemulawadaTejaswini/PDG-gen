import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, t;
		x = sc.nextInt();
		t = sc.nextInt();
		sc.close();
		
		int ans = x - t;
		if(ans < 0)ans = 0;
		System.out.println(ans);
	}

}
