import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char c = in.next().charAt(0);
		switch (c) {
		case 'A': c = 'T'; break;
		case 'T': c = 'A'; break;
		case 'G': c = 'C'; break;
		case 'C': c = 'G'; break;
		}
		System.out.println(c);
	}

}
