import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int op = 0;
        for (int i = 0; i < n; i++) {
            while (0 < arr[i]) {
                arr[i]--;
                op++;
                for (int s = i+1; s < n; s++) {
                    if (arr[s] != 0) {
                        arr[s]--;
                    } else {
                        break;
                    }
                }
            }
        }
        System.out.println(op);
    }
}