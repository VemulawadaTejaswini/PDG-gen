import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        String b = Integer.toString(n, k);
        System.out.println(b.length());
        sc.close();
    }
}
