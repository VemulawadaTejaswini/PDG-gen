import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] list = new int[n];
        for (int i = 0; i < n; i++) list[i] = sc.nextInt();

        int result = 0;
        for (int i = 0; i < n; i++) {
            if ((i+1)%2 != 0) {
                if (list[i]%2 != 0) result++;
            }
        }
        System.out.println(result);
    }
}