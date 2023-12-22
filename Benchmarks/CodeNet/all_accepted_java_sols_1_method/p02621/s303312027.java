import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int s = kb.nextInt();
		System.out.println((int) (s + Math.pow(s, 2) + Math.pow(s, 3)));
		kb.close();
	}

}
