import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int i=0;
		while(N >= Math.pow(2, i)) {
			i++;
		}
		System.out.println((int)Math.pow(2, i-1));

	}

}
