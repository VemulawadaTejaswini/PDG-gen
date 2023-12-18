import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        sc.close();
        int max = Math.max(Math.max(A + B, A - B), A * B);
        System.out.println(max);
    }
}
