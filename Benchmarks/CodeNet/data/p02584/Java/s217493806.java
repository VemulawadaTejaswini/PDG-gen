
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long start = in.nextLong();
        long nSteps = in.nextLong();
        long hop = in.nextLong();

        for (int i = 0; i < nSteps; i++) {
            start = (start > 0) ? (start - hop) : (start + hop);
        }

        System.out.println(Math.abs(start));
    }
}
