import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        String input = stdIn.next();

        //System.out.println(input);

        if("AAA".equals(input) || "BBB".equals(input)) {
        	System.out.println("No");
        }else {
        	System.out.println("Yes");
        }
    }
}