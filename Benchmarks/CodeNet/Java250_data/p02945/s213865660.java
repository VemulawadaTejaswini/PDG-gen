import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] result = {a + b, a - b, a * b};
        int max = result[0];
        for (int i = 0; i < 3; i++) {
            if (max < result[i]) {
                max = result[i];
            }
        }
        System.out.println(max);
        sc.close();
    }
}