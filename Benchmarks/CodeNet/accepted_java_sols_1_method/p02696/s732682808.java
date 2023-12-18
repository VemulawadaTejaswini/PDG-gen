import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        long B = sc.nextLong();
        long N = sc.nextLong();

        long x = Math.min(N, B-1);

        long score = A*x/B;

        System.out.println(score);

        sc.close();
    }
}