import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = Integer.parseInt(sc.next());
		int w = Integer.parseInt(sc.next());

		if(h+w>=10) {
			System.out.println("error");
		}else {
			System.out.println(h+w);
		}
	}
}


