import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int K = sc.nextInt();

        int num = 0;
        while (A >= B) {
            B *= 2;
            num++;
        }
        while (B >= C) {
            C *= 2;
            num++;
        }
        System.out.println(num <= K ? "Yes" : "No");
    }
}
