import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String x = sc.next();
		if (x.endsWith("s")) {
			x+="es";
		}else {
			x+="s";
		}
		System.out.println(x);

	}

}