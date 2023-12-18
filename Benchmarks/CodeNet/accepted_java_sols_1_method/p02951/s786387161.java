import java.util.Scanner;

public class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int capacityOfA = scan.nextInt();
		int waterInA = scan.nextInt();
		int waterInB= scan.nextInt();
		int printNum = waterInB - (capacityOfA - waterInA);
		if(printNum < 0){
			printNum = 0;
		}
		System.out.println(printNum);
	}
}