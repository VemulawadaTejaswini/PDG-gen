import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			float L = Float.parseFloat(sc.next());
			float ippen = L / 3;
			float ans = ippen * ippen * ippen;
			System.out.println(ans);

		} finally

		{
			sc.close();
		}
	}

}
