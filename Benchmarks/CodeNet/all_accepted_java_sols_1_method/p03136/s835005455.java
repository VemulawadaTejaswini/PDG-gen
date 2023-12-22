import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] lArr = new int[n];

        int max = 0;
        int maxIndex = 0;
        for (int i = 0; i < n; i++) {
            lArr[i] = sc.nextInt();
            if (max < lArr[i]) {
                max = lArr[i];
                maxIndex = i;
            }
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (i != maxIndex) sum += lArr[i];
        }

        System.out.println(sum > max ? "Yes" : "No");
    }
}
