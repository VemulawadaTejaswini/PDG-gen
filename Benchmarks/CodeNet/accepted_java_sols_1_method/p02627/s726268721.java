import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        char x = S.charAt(0);
        if ('A' <= x && x <= 'Z') {
            System.out.println('A');
        } else {
            System.out.println('a');
        }
    }
}

