import java.util.Scanner;

public class Main {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner imput =  new Scanner(System.in);
		int  A,B;
		A=imput.nextInt();
		B=imput.nextInt();
		int max=A+B;
		if(2*A-1>max)
			max=2*A-1;
		else if(2*B-1>max)
			max=2*B-1;
		System.out.println(max);
	}
}