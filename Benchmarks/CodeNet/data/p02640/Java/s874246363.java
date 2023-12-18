import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int Y = sc.nextInt();
		if(Y % 2 == 0 && X * 2 <= Y && X * 4 >= Y)
			System.out.println("Yes");
		else
			System.out.println("No");
	}

}