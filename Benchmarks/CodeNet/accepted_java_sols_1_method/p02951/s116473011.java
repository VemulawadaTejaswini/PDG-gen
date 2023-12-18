import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
		int nokori = c - (a - b);
		
		
		if (nokori < 0) {
			System.out.println(0);
		}
		
		else {
			System.out.println(nokori);
		}
	}		
}