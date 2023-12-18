import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long sum = a + a * a + a * a * a;
        System.out.println(sum);
    }
}