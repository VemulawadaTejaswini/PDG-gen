import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int H1 = sc.nextInt();
        int M1 = sc.nextInt();
        int H2 = sc.nextInt();
        int M2 = sc.nextInt();
        int K = sc.nextInt();
        int result = (H2 - H1)*60 + (M2 - M1);
        System.out.println(result - K);
    }
}
