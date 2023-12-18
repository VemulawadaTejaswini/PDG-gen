
import java.util.*;
import static java.util.Map.Entry.comparingByValue;
import static java.util.stream.Collectors.toMap;

public class Main {

    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);
        int A = Input.nextInt();
        int B = Input.nextInt();

        int C = A + B + 1;

        int V = 0;
        int L = 0;
        boolean T = false;

        String S = Input.next();

        if (S.length() != C) {
            System.out.println("No");
        } else {
            if (S.charAt(A) == '-') {
                T = true;
            }
            for (int I = 0; I < S.length(); I++) {
                if (S.charAt(I) == '-') {
                    L++;
                } else {
                    V++;
                }
            }
            if (L == 1 && T) {
                System.out.println("Yes");

            } else {
                System.out.println("No");
            }
        }

    }
}
