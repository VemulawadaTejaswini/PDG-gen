import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int i = kb.nextInt();
		int j = kb.nextInt();
		int count = 0;
		int price = 0;
		while (count < i) {
			count += 1;
			price += 500;
		}
		if (price >= j)
			System.out.println("Yes");
		else
			System.out.println("No");
		kb.close();
	}

}
