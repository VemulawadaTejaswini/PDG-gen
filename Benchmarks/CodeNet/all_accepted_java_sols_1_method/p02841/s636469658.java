import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
        Scanner stdin = new Scanner(System.in);

        int M1 = stdin.nextInt();
        int D1 = stdin.nextInt();
        int M2 = stdin.nextInt();
        int D2 = stdin.nextInt();
        
        if(M1 != M2) {
        	System.out.print("1");
        }
        else {
        	System.out.print("0");
        }
    }
}
