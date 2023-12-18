import java.util.*;

//Circle in a Rectangle
public class Main {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int i = 1;
		while(true)
		{
			String input = sc.nextLine();
			int x = Integer.parseInt(input);
			if(x == 0) break;
			System.out.println("Case "+i+": "+ x);
		}
		sc.close();
	}
}
