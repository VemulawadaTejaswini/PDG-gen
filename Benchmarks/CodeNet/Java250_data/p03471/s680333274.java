import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner dataScanner = new Scanner(System.in);
        String[] data = dataScanner.nextLine().split(" ");
        int numCards = Integer.parseInt(data[0]);
        int goal = Integer.parseInt(data[1]);
        boolean foundPair = false;
        Integer[] pair = new Integer[3];
        int otoshidama = 0;
        outerloop:
        for (Integer i = 0; i < Math.max(numCards,0)+1; i++) {
            for (Integer j = 0; j < Math.max(numCards-i, 0)+1; j++) {
                int k = numCards - i - j;
                otoshidama = 10000 * i + 5000 * j + 1000 * k;
                if (otoshidama == goal) {
                    foundPair = true;
                    pair[0] = i;
                    pair[1] = j;
                    pair[2] = k;
                    break outerloop;
                }
            }
        }
        if (foundPair) {
            StringJoiner toPrint = new StringJoiner(" ");
            for (Integer number : pair) {
                toPrint.add(number.toString());
            }
            System.out.println(toPrint.toString());
        } else {
            System.out.println("-1 -1 -1");
        }
    }
}
