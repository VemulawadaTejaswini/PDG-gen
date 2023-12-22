import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = Integer.parseInt(in.next());
		int b = Integer.parseInt(in.next());
		int c = Integer.parseInt(in.next());
		int count = 0;
		
		for (int i = a; i <= b; i++) {
			if (c % i == 0) {
				count++;
			}
		}
		
		System.out.println(count);
	}
}	
