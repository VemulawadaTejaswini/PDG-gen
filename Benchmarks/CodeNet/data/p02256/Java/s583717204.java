import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int a = in.nextInt();
            int b = in.nextInt();
            int Function = Function(a, b);
            
            System.out.print(Function);
            
	}
	public static int Function(int a, int b) {
		if(b != 0)
			return Function(b, a % b);
		else
			return a;
	}
}
