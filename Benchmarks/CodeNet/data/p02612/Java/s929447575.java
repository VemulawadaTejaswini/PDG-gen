import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int s = kb.nextInt();
		int p = 1000 - s % 1000;
		if (p == 1000) {
			System.out.println(0);
		} else {
			System.out.println(p);
		}
		kb.close();
	}

}
