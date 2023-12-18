import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
        final int N = s.nextInt();
        long result = 1;
        // long tmpA;
        List<Long> aList = new ArrayList<Long>();

        for(int i = 0 ; i < N ; i++) {
            aList.add(s.nextLong());
        }
        for (long tmpA : aList) {
            if (result * tmpA > 1000000000000000000l) {
                result = -1;
                break;
            }
            result = result * tmpA;
        }
        System.out.println(result);
    }
}