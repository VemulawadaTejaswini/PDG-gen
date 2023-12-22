import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        float tempRes = 0;
        for (int i = 0; i < N; i++) {
            int A = in.nextInt();
            tempRes += (float) 1 / A;
        }
        System.out.println(1 / tempRes);
    }
}
