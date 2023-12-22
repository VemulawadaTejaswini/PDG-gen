import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int even = K / 2;
        int odd = K - even;
        System.out.println(even*odd);
    }
}
