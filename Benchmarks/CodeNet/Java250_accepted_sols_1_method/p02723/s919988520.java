import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
	Scanner scanner = new Scanner(System.in);

	String string = scanner.next();
	scanner.close();

	boolean result = false;

	boolean firstCondition = string.substring(2).startsWith(string.substring(3, 4));
	boolean secondCondition = string.substring(4).startsWith(string.substring(5, 6));

	result = firstCondition && secondCondition;

	System.out.println(result ? "Yes" : "No");
    }

}