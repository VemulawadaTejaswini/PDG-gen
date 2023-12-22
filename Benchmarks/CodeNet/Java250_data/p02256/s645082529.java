import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int a = in.nextInt();
            int b = in.nextInt();
            in.close();
            System.out.println(Function(a, b));
            
            
            
	}
	public static int Function(int a, int b) {
		if(b != 0)
			return Function(b, a % b);
		else
			return a;
	}
}
	
