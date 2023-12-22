import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int time = scan.nextInt();
		
		int s = time % 60;
		time -= s;
		
		int h = time / 3600;
		time -= h * 3600;
		
		int m = time / 60;
		
		
		System.out.println(h + ":" + m + ":" + s);
		
	}

}