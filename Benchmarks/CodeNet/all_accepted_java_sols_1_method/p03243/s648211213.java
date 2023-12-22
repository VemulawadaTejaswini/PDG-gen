import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		if (N<112)
			System.out.println(111);
		else if (N<223)
			System.out.println(222);
		else if (N<334)
			System.out.println(333);
		else if (N<445)
			System.out.println(444);
		else if (N<556)
			System.out.println(555);
		else if (N<667)
			System.out.println(666);
		else if (N<778)
			System.out.println(777);
		else if (N<889)
			System.out.println(888);
		else 
			System.out.println(999);
		sc.close();

	}

}