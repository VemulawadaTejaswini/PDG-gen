import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader input = null;

    static {
        input = new BufferedReader(new InputStreamReader(System.in));
    }

    public static void main(String ar[]) throws IOException {
        char str[] = input.readLine().toCharArray();

        int first = (str[1] - '0') + ((str[0] - '0') * 10);
        int second = (str[3] - '0') + ((str[2] - '0') * 10);


        boolean first_is_month = first >= 1 && first <= 12;
        boolean second_is_month = second >= 1 && second <= 12;


        if (first_is_month && second_is_month)
            System.out.println("AMBIGUOUS");
        else if (!first_is_month && !second_is_month) {
            System.out.println("NA");
        } else if (first_is_month) {
            System.out.println("MMYY");
        } else if (second_is_month) {
            System.out.println("YYMM");
        }
    }
}
