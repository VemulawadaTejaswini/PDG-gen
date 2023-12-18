import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] array = sc.next().toCharArray();
		for (int i=0; i<4; i++) System.out.print(array[i]);
		System.out.print(" ");
		for (int i=4; i<12; i++) System.out.print(array[i]);
		System.out.println();
		sc.close();
	}

}
