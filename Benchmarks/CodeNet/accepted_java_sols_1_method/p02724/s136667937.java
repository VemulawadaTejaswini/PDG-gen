import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
	// 1000 happiness points for each 500-yen coin
	// 5 happiness points for each 5-yen coin he has
	Scanner scanner = new Scanner(System.in);

	int x = scanner.nextInt();
	scanner.close();

	int count500 = x / 500;
	int count5 = (x - count500 * 500) / 5;

	int result = count500 * 1000 + count5 * 5;

	System.out.println(result);
    }
}