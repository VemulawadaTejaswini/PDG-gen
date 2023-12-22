import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int L = sc.nextInt();
        int sum = calcSum(L, L + N - 1);

        if (L > 0)
            System.out.println(sum - L);
        else if (N + L <= 0 && L <= 0)
            System.out.println(sum - (L + N - 1));
        else
            System.out.println(sum);
        
    }

    static int calcSum(int a, int b) {
        return (a + b) * (b - a + 1) / 2;
    }
}
