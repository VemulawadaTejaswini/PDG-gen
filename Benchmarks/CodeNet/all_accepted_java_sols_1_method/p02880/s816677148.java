import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(), flag = -1;
        for (int i = 1; i < 10; i++) {
            if (N % i == 0 && N / i < 10) flag = 1;
        }
        System.out.println(flag == 1 ? "Yes" : "No");
        in.close();
    }
}
