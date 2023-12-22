import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int stay = scanner.nextInt();
		int day = scanner.nextInt();
		int cost1 = scanner.nextInt();
		int cost2 = scanner.nextInt();

		if(stay <= day) {
			System.out.println(stay * cost1);
		}else if(stay > day){
			System.out.println(day * cost1 + (stay - day) * cost2);
		}

		scanner.close();
	}
}