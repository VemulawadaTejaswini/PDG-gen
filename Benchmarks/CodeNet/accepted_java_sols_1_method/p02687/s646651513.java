import java.util.Scanner;

public class Main {
    public static void main(final String args[]) {
        Scanner scan = new Scanner(System.in);
        String X = scan.next();
        if("ABC".equals(X)){
            System.out.println("ARC");
        }else if("ARC".equals(X)){
            System.out.println("ABC");
        }
    }
}