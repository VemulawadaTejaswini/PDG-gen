import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int i = kb.nextInt();
		int j = kb.nextInt();
		int k = kb.nextInt();
		if (i + j + k >= 22)
			System.out.println("bust");
		else
			System.out.println("win");
		kb.close();
	}

}
