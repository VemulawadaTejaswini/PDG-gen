import java.util.Scanner;

/**
 * Finding a Word
 */
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String keyword = scan.next().toLowerCase();
        String str = null;
        int match = 0;
        while (scan.hasNext()) {
            str = scan.next();
            if (str.matches("END_OF_TEXT")) {
                break;
            }
            if (str.toLowerCase().matches(keyword)) {
                match ++ ;
            }
        }
        System.out.println(match);
    }
}