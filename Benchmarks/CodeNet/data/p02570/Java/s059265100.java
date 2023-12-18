import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		int d=input.nextInt();
		int t=input.nextInt();
		int s=input.nextInt();
		if((d/s)<=t)
			System.out.println("Yes");
		else
			System.out.println("No");
		

	}

}
