import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		sc.close();
		int rest = N % 10;
		if(rest == 3) {
			System.out.println("bon");
			return;
		}else if(rest == 0 | rest == 1 | rest == 6 | rest == 8) {
			System.out.println("pon");
			return;
		}else {
			System.out.println("hon");
			return;
		}
	}

}