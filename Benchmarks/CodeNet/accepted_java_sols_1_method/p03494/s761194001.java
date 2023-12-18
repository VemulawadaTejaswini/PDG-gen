
import java.util.*;
import static java.util.Map.Entry.comparingByValue;
import static java.util.stream.Collectors.toMap;

public class Main {

    public static void main(String[] args) {
        int C = 0;
        Scanner Input = new Scanner(System.in);
        int N = Input.nextInt();
        Integer A[] = new Integer[N];
        boolean T = true;

        for (int I = 0; I < N; I++) {
            A[I] = Input.nextInt();
        }

        while (T) {
            for (int I = 0; I < N; I++) {
                String S = A[I] + "";
                if (Integer.parseInt(S.charAt(S.length() - 1) + "") % 2 == 0) {
                    A[I] = A[I] / 2;
                     C++;
                } else {
                    T = false;
                }
            }
       }
        System.out.println(C/N);
    }
}
