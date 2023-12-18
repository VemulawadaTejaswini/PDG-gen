import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
        final int N = s.nextInt();

        String nStr = String.valueOf(N);
        int nStrOne = Integer.parseInt(nStr.substring(nStr.length() - 1));
        //System.out.println(nStrOne);
        if (nStrOne == 2
                || nStrOne == 4
                || nStrOne == 5
                || nStrOne == 7
                || nStrOne == 9) {
            System.out.println("hon");
        } else if (nStrOne == 0
                || nStrOne == 1
                || nStrOne == 6
                || nStrOne == 8) {
            System.out.println("pon");
        } else {
            System.out.println("bon");
        }
    }
}