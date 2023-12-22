import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int total = 0;
        total = 800 * N - 200 * (N / 15);
        System.out.println(total);
    }
}
