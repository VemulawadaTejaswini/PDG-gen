import java.util.*;

public class Main

{

	public static void main(String[] args)

	{

		Scanner input = new Scanner(System.in);

		int a = input.nextInt();

		int b = input.nextInt();

		if(a > 8 || b > 8) {

			System.out.println(":(");

		} else {

			System.out.println("Yay!");

		}

	}

}