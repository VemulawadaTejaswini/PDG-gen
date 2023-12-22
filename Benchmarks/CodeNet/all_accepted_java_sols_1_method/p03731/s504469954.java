import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int time = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n - 1; i++) {
            if (array[i + 1] - array[i] < time) {
                sum += (array[i + 1] - array[i]);
            } else {
                sum += time;
            }
        }
        sum += time;
        System.out.println(sum);
    }
}
