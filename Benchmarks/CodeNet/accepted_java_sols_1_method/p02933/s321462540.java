import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

    	Scanner scan = new Scanner(System.in);

        int    A = scan.nextInt();
      	String S = scan.next();

      	S = A >= 3200 ? S : "red";
        
        System.out.print(S);

      	scan.close();

	}

}
