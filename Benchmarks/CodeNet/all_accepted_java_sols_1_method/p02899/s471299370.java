import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] sol = new int[N];

        for (int i = 1; i <= N; i++) sol[sc.nextInt() - 1] = i;
        for (int s : sol) System.out.print(s + " ");
    }
}