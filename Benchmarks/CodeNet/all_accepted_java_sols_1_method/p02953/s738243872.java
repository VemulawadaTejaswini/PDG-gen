import java.util.*;

class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = n-1; i >= 0; i--) {
            arr[i] = sc.nextInt();
        }

        String answer = "Yes";
        for (int i = 1; i < n; i++) {
            int diff = arr[i] - arr[i-1];
            if (diff > 1) {
                answer = "No";
                break;
            } else if (diff == 1) {
                arr[i]--;
            }
        }
        System.out.println(answer);
    }
}