import java.util.*;

public class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        List<Integer> ans = new ArrayList<>();
        int n = 0;
        do {
            n = input.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n ; i ++) {
                arr[i] = input.nextInt();
            }

            Arrays.sort(arr);

            int sum = 0;
            for (int i= 1; i < n-1; i ++) {

                sum += arr[i];
            }

            int result = sum / (n -2);
            ans.add(result);
        } while (n > 0);

        for (int i = 0; i < ans.size() -1; i ++) {
            System.out.println(ans.get(i));
        }
    }
}
