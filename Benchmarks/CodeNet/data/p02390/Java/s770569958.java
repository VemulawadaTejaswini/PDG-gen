import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int s = (new Scanner(System.in)).nextInt();
		int hour = s/3600;
		int min = (s%3600)/60;
		int sec = (s%3600)%60;
		
		System.out.printf("%d:%d:%d\n", hour, min, sec);
	}

}