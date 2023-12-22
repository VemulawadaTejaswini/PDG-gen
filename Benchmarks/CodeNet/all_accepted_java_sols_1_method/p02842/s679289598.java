import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();

            int ans = (int) Math.ceil(N / 1.08);

            int check = (int) (ans * 1.08);

            if (N != check) {
                System.out.println(":(");
            } else {
                System.out.println(ans);
            }
        }
    }

}
