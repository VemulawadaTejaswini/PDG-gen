import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		
		String[] line = new String[h];
		
		for(int i = 0; i < h; i++) {
			line[i] = sc.next();
			
		}
		
		System.out.print("#");
		for(int i = 0; i < w; i++) {
			System.out.print("#");
		}
		System.out.println("#");
		
		for(int i = 0; i < h; i++) {
			System.out.println("#" + line[i] + "#");
		}
		
		System.out.print("#");
		for(int i = 0; i < w; i++) {
			System.out.print("#");
		}
		System.out.println("#");

	}

}
