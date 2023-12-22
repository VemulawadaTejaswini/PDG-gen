import java.util.Scanner;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int valores[] = new int[3];
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0; i < 3; i++) {
			valores[i] = scanner.nextInt();	
		}
		Arrays.sort(valores);
		System.out.println(valores[0] + valores[1]);
	}
}