import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int tmp = b -a -1;
		int ans = 0;
		
		for(int i = tmp;tmp > 0;tmp--)
			ans += tmp;
		
		System.out.println(ans - a);
	}

}
