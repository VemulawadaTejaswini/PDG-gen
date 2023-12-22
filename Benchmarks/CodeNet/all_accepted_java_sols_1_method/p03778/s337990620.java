import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int res = 0;
		if ( (a+w) < b ) res = b-(a+w);
		if ( (b+w)<a ) res = a-(b+w);
		
		System.out.println(res);
	}
}
