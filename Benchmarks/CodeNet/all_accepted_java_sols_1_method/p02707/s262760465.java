import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] syain = new int[N];

        for (int i = 0; i < N - 1; i++) {
            syain[sc.nextInt()-1]++;
        }

        for (int a : syain) {
            System.out.println(a);
        }
    }
}