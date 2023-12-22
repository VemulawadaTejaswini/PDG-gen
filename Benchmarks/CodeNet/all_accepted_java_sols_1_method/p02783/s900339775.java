
import java.util.Scanner;

class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int H = Integer.parseInt(sc.next());
		int A = Integer.parseInt(sc.next());
		int count = 0;

		while(true) {
			if(H <= 0) break;
			count++;
			H -= A;

		}
		System.out.println(count);
	}
}