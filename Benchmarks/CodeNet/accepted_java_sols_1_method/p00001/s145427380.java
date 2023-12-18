import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int first = 0;
		int second = 0;
		int third = 0;
		for(int i=1; i<=10; i++) {
			int height = s.nextInt();
			if(height > first) {
				third = second;
				second = first;
				first = height;
			} else if(height > second) {
				third = second;
				second = height;
			} else if(height > third) {
				third = height;
			}
		}
		System.out.println(first);
		System.out.println(second);
		System.out.println(third);
		s.close();
	}

}