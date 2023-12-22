import java.util.Scanner;
import java.util.Arrays;

public class Main
{

	public static void main(String[] args)
	{	Scanner s = new Scanner(System.in);
                int n = s.nextInt();
                int d = s.nextInt();
                System.out.println(n*d-n-d+1);
	}
}