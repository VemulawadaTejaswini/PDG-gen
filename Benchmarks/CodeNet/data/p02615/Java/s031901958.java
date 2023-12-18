import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        Arrays.setAll(array, i -> sc.nextInt());
        Arrays.sort(array);
        long ans = array[n - 1];
        int maxIndex = n - 2;
        boolean isOK = true;
        for (int i = 2; i < n; i++) {
            isOK = !isOK;
            ans += array[maxIndex];
            if (isOK) {
                maxIndex--;
            }
        }
        System.out.println(ans);
    }
}