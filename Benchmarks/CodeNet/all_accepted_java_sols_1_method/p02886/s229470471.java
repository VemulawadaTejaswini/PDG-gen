import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int hp = 0;
        for(int j = 0; j < n; j++) {
            for(int k = j + 1; k < n; k++) {
                hp += arr[j] * arr[k];
            }
        }
        System.out.println(hp);
    }
}
