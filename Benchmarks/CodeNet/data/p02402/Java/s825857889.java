import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();	
		
		String line = sc.nextLine();
		String[] x = line.split(" ");
		int[] y = new int [a];

		for (int i = 0; i < a; i++) {
			y[i] = Integer.parseInt(x[i]);
		}

		Arrays.sort(y);
		int z = 0;
		for (int i = 0; i < y.length; i++) {
			z += y[i];
		}

		System.out.println(y[0] + " " + y[y.length-1] + " " + z);

	}

}

