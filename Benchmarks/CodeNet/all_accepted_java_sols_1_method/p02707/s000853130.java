import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int day[] = new int[scan.nextInt()];
		
		for(int i = 0; i < day.length - 1;i++) {
			day[scan.nextInt() - 1]++;
			
		}
		
		for(int data : day) {
			System.out.println(data);
			
		}
		
		
	}
}

