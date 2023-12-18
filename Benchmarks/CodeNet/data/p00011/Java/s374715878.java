import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int n = sc.nextInt();

        int[] arr = new int[w + 2];
        for (int i = 1; i < w + 1; i++) {
            arr[i] = i;
        }

        for (int i = 0; i < n; i++) {
            String[] s = sc.next().split(",");
            int a = Integer.parseInt(s[0]);
            int b = Integer.parseInt(s[1]);

            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
        }

        for (int i = 1; i < w + 1; i++) {
            System.out.println(arr[i]);
        }
    }
}
