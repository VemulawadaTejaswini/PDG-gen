import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int point = 0;
		int res = 1;
		for(int i = 0; i < n; i++) {
			point += Integer.parseInt(sc.next());
			if(x < point) break;
			res++;
		}
		System.out.println(res);
	}
}