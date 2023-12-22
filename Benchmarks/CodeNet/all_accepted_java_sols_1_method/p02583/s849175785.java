
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] bruh = new int[n];
        for (int i = 0; i < n; i++) {
            bruh[i] = in.nextInt();
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (bruh[i] != bruh[k]
                            && bruh[i] != bruh[j]
                            && bruh[k] != bruh[j]) {
                        if (bruh[i] + bruh[j] > bruh[k]
                                && bruh[i] + bruh[k] > bruh[j]
                                && bruh[j] + bruh[k] > bruh[i]) {
                            count++;
                        }
                    }

                }

            }

        }
        System.out.println(count);

    }
}
