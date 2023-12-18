import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		int max, min;
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i <= 6; i++) {
		max = sc.nextInt();
		min = sc.nextInt();
		System.out.print(max-min);
		}

	}
	

}