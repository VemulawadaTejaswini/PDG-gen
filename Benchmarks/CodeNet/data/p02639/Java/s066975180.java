import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = in.nextInt();
            if (arr[i] != i + 1) {
                System.out.println(i + 1);
                return;
            }
        }
    }
}
