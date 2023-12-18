import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int inh = input.nextInt();
		int inw = input.nextInt();
		System.out.println(inh * inw + " " + (inh * 2 + inw * 2));
	}

}