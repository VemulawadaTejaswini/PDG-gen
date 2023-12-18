import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        {
            Scanner input = new Scanner(System.in);
            int mis = 0, N;
            N = input.nextInt();

            for(int i = 0; i<N; i++) {
                int cur = input.nextInt();
                if (cur != i+1)
                    mis++;
            }
            String ans = (mis <= 2) ? "YES" : "NO";
            System.out.println(ans);
        }
    }
}