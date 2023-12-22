import java.util.Scanner;
import java.util.stream.LongStream;

public class Main
{

	public static void main(String[] args)
	{
		System.out.println(LongStream.rangeClosed(1, Integer.parseInt((new Scanner(System.in)).next())).reduce(1, (x, y) -> (x * y) % 1000000007));
	}
}