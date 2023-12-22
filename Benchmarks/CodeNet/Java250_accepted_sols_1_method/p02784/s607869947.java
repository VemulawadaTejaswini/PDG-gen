import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int N = sc.nextInt();
        int count = 0;
        boolean flag = false;
        for (int i = 0; i < N; i++) {
            count += sc.nextInt();
            if (H <= count) {
                flag = true;
            }
        }
        System.out.println(flag ? "Yes" : "No");
    }
}