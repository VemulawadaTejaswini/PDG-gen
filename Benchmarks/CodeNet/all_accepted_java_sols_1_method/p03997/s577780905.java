import java.util.Scanner;
public class Main {
	private static Scanner s;
	public static void main(String[] args) {
		s = new Scanner(System.in);		
		System.out.println((s.nextInt()+s.nextInt())*s.nextInt()/2);
	}	
}