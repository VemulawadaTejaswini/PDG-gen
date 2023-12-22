import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int W = Integer.parseInt(sc.next());
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());

		if (a+W < b){
			System.out.println(b-(a+W));
		}else if (b+W < a){
			System.out.println(a-(b+W));
		}else {
			System.out.println(0);
		}
	}
}