import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();

        int result = (int)Math.pow(k/2, 2);
        if (k % 2 == 1) result = (k/2) * (k/2+1);
        System.out.println(result);
    }
}
