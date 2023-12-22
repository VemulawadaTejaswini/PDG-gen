import java.util.Scanner;

public class Main { 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] line = sc.nextLine().split(" ");
		int targetNumber = Integer.parseInt(line[0]);
		int stanNumber = Integer.parseInt(line[1]);
		
		if(targetNumber< stanNumber) {
			System.out.println(0);
		}else {
			System.out.println(10);
		}
	}
}
	
	