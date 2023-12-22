import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int k = sc.nextInt();
        int result = k * (int)Math.pow(k - 1, n - 1);
        System.out.println(result);
    }
}