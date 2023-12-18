import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 

		int s = sc.nextInt();
		
		int h = s / 3600;
		s = s % 3600;
		int m = s / 60;
		s = s % 60;
		
		System.out.print(h + ":" + m + ":" + s);

		sc.close();
	}

}