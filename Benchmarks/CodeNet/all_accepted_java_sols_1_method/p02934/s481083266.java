import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        float[] A = new float[N];

        for (int i = 0; i < N; i++)
            A[i] = sc.nextFloat();

        float ans = 0.0f;

        for (int i = 0; i < N; i++)
            ans += 1 / A[i];

        ans = 1 / ans;

        System.out.println(ans);

    }
}