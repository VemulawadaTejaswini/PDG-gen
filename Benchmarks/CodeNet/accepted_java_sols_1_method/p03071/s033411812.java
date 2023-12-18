import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int result = 0;
        if (Math.abs(a-b) <= 1) {
            result = a + b;
        } else if (Math.abs(a-b) >= 2) {
            result = Math.max(a, b)*2 - 1;
        }
        
        System.out.println(result);
    }
}
