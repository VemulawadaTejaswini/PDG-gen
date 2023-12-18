import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int result = -1;
        if (a > 0 && a < 10 && b > 0 && b < 10) result = a * b;
        System.out.println(result);
        
    }
}
