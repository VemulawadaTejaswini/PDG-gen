import java.util.*;
import java.lang.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        //コード
        Scanner scanner = new Scanner(System.in);
        Integer k = Integer.parseInt(scanner.next());
        Integer x = Integer.parseInt(scanner.next());

        Integer range =  k - 1;

        if (k == 1) {
            System.out.println(x);
            System.exit(0);
        }

        String sum = new String();
        Integer start = x - range;
        Integer end = x + range;

        while(start <= end) {
            sum += start.toString() + " ";
            start++;
        }

        System.out.println(sum.trim());
    }
}