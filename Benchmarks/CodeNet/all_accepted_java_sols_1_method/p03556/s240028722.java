import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int max = 0;
		for(int i = 1;;i++) {
			if(i * i > N) {
				break;
			}
			if(i * i >= max) {
				max = i * i;
			}
		}
		System.out.println(max);
	}
}