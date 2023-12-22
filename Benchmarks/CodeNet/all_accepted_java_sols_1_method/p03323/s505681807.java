import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int A=stdIn.nextInt();
		int B=stdIn.nextInt();
		if(A>8)
			System.out.println(":(");
		else
			if(B>8)
				System.out.println(":(");
			else
				System.out.println("Yay!");
	}
}