import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int A=stdIn.nextInt();
		int B=stdIn.nextInt();
		int C=stdIn.nextInt();
		if(A<=C&&C<=B)
			System.out.println("Yes");
		else
			if(B<=C&&C<=A)
				System.out.println("Yes");
			else
				System.out.println("No");
	}
}