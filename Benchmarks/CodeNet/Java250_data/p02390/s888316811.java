import java.util.Scanner;


public class Main {
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		final long time = sc.nextLong();
		
		System.out.println(time / (60 * 60) + ":" + (time / 60 % 60) + ":" + (time % 60));
		
	}
	
}