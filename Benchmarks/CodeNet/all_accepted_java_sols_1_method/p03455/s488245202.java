import java.util.*;

public class Main {
    public static void main(String[] argv)
    {
	Scanner sc = new Scanner(System.in);
	int a, b;
	a = Integer.parseInt(sc.next());
	b = Integer.parseInt(sc.next());
	if (a * b % 2 != 0)
	    System.out.println("Odd");
	else
	    System.out.println("Even");
    }
}
