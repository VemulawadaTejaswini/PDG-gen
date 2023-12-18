import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int remain = a - b;
        while ((remain - c) >= 0) {
                remain -= c;
        }
        System.out.println(remain);
    }
}
