import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int firstInt = sc.nextInt();

		System.out.println(firstInt + firstInt * firstInt + firstInt * firstInt * firstInt);

		sc.close();

	}

}