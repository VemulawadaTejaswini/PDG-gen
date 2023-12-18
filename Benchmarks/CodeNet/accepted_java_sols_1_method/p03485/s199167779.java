import java.util.*;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int x = (a + b) % 2;
		int y = (a + b) / 2;
		if(x == 0)
		{
			System.out.println(y);
		}
		else 
		{
			y = y + 1;
			System.out.println(y);
		}
	}

}
