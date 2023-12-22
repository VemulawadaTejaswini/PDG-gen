import java.util.Scanner;

/**
 * Created by wild on 16/09/26.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String one = scan.next();
        String two = scan.next();
        String three = scan.next();

        boolean ok = true;
        char turn = 'a';
        char winner = 'a';

        while (ok) {
            switch (turn) {
                case 'a':
                    if (one.equals(" ")){
                        winner = 'A';
                        ok = false;
                    }else {
                        turn = one.charAt(0);
                        one = ret(one);
                    }
                    break;
                case 'b':
                    if (two.equals(" ")){
                        winner = 'B';
                        ok = false;
                    }else {
                        turn = two.charAt(0);
                        two = ret(two);
                    }
                    break;
                case 'c':
                    if (three.equals(" ")){
                        winner = 'C';
                        ok = false;
                    }else {
                        turn = three.charAt(0);
                        three = ret(three);
                    }
                    break;
            }

        }
        System.out.println(winner);
    }

    public static String ret(String str) {
        if (str.length() != 1) {
            return str.substring(1);
        } else {
            return " ";
        }
    }
}