import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);

		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		int c = stdIn.nextInt();
		int hantei=0;

		if (a<b)
			if(b<c)
				hantei=1;
			else
				hantei=0;
		else
			hantei=0;

		if(hantei==1)
			System.out.println("Yes");
		else
			System.out.println("No");

	}

}
