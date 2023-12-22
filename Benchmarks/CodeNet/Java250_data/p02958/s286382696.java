import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner reader = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n, dato, error=0;
		n = reader.nextInt();
		for(int i=1; i <= n; i++) {
			dato = reader.nextInt();
			if(dato != i) {
				++error;
			}
		}
		if(error <=2)
			System.out.println("YES");
		else
			System.out.println("NO");
	}

}
