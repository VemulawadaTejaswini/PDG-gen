import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        String X = scanner.next();
        String Y = scanner.next();
        int x = X.codePointAt(0);
        int y = Y.codePointAt(0);
        if(y-x > 0){
            System.out.println("<");
        }
        if(x-y > 0){
            System.out.println(">");
        }
        if(x == y){
            System.out.println("=");
        }
    }

}
