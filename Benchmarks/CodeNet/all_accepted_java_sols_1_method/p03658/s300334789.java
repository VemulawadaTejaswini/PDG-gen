import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        Integer[] lArr = new Integer[n];

        for (int i = 0; i < n; i++) {
            lArr[i] = sc.nextInt();
        }

        Arrays.sort(lArr, Collections.reverseOrder());
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += lArr[i];
        }

        System.out.println(sum);
    }
}
