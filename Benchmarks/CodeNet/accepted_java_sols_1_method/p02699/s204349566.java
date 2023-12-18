import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int S=stdIn.nextInt();
		int W=stdIn.nextInt();
		if(S>W)
			System.out.println("safe");
		else
			System.out.println("unsafe");

	}

}
