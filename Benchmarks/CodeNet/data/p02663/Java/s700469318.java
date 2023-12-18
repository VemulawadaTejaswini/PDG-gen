import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h1 = sc.nextInt();
		int m1 = sc.nextInt();
		int h2 = sc.nextInt();
		int m2 = sc.nextInt();
		int k = sc.nextInt();
		int awakeningTime = 0;
		if(m2 >= m1) {
			awakeningTime = 60 * (h2 -h1) + (m2 -m1);
		}else {
			awakeningTime = 60 * (h2 -h1-1) + (m2 + (60 - m1));
		}
		System.out.println(awakeningTime - k);
	}

}