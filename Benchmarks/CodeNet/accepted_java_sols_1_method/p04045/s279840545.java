
import java.util.*;

/**
 * @author mix
 */
public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s1 = new Scanner(System.in);
        int N = s1.nextInt();
        int K = s1.nextInt();
        Integer[] arr = new Integer[K];

        for (int i = 0; i < K; i++) {
            arr[i] = s1.nextInt();
        }

        String numberInString = N + "";
        boolean obstacle = false;

        int res = N;
        while (true) {

            for (Integer hate : arr) {
                if (numberInString.contains(hate + "")) {
                    obstacle = true;
                    break;
                }
            }
            if (!obstacle) {
                System.out.println(numberInString);
                return;
            } else {
                res++;
                numberInString = res + "";
                obstacle = false;
            }
        }


    }

}
