import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        String S = stdIn.next();
        stdIn.close();

        for (int i = 0; i < S.length(); i++) {
            System.out.print('x');
        }
    }
}