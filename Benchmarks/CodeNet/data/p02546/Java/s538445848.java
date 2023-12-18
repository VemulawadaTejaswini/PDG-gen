
import java.util.Scanner;


public  class main {
	public static void main( String[] args) {
        Scanner input = new Scanner(System.in);
        String S = input.next();
        if(S.endsWith("s")) {
            System.out.println(S+"es");
        }
        else {
            System.out.println(S+"s");
        }


    }
}