import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

	    String word = sc.next();
	    String result = "";
	    if (word.equals("Cloudy")) result = "Rainy";
	    if (word.equals("Rainy")) result = "Sunny";
	    if (word.equals("Sunny")) result = "Cloudy";

		System.out.println(result);

    }
}
