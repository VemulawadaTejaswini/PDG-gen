import java.util.Scanner;
public class Main{
    public static void main(String argv[])
    {
	Scanner scan = new Scanner(System.in);

	int num = scan.nextInt();
	int num1 = scan.nextInt();
	int num2 = scan.nextInt();


	if( num < num1 && num1 < num2)

	    System.out.println("Yes");
else
	System.out.println("No");
    }

}