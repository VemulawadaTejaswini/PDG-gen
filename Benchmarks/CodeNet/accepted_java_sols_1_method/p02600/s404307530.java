import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		if(X < 600)
			System.out.println(8);
		else if(X < 800)
			System.out.println(7);
		else if(X < 1000)
			System.out.println(6);
		else if(X < 1200)
			System.out.println(5);
		else if(X < 1400)
			System.out.println(4);
		else if(X < 1600)
			System.out.println(3);
		else if(X < 1800)
			System.out.println(2);
		else
			System.out.println(1);
	}

}
