import static java.lang.System.out;
import java.util.Scanner;

public class Main {
	  public static void main(String...args) {
			    String str = new Scanner(System.in).nextLine();
			    String[] list = str.split(" ");
			    String x = list[0];
			    String y = list[1];

			    int a = Integer.parseInt(x);
			    int b = Integer.parseInt(y);

				int sum = a * b;
                int cm = (a + b) * 2;

                out.println(sum + " " + cm);

	  }


}