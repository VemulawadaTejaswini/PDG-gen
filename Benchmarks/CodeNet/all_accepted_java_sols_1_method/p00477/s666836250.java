import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sec = sc.nextInt() + sc.nextInt() + sc.nextInt() + sc.nextInt();
		
		System.out.println(sec / 60);
		System.out.println(sec % 60);
		
		
	}

}