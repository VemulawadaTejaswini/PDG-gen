import java.util.*;

public class Main {

    public static List<List<Integer>> switchList;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int L = sc.nextInt();
        sc.close();

        int baseVal = L - 1;
        int[] apples = new int[N];
        for (int i = 0; i < N; i++) {
            apples[i] = (i + 1) + baseVal;
        }

        int sum = 0;
        boolean isEat = false;
        for (int i = 0; i < N; i++) {
            int taste = apples[i];
            if (!isEat) {
                if (taste >= 0) {
                    isEat = true;
                    continue;
                }
            }
            sum += taste;
        }
        if (!isEat) {
            sum -= apples[N - 1];
        }
        System.out.println(sum);
    }

}