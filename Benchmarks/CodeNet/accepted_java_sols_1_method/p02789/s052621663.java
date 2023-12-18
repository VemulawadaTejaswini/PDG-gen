import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int M = sc.nextInt();

            String ans = (N == M) ? "Yes" : "No";

            System.out.println(ans);
        }
    }

}
