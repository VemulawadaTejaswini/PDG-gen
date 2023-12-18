import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int k = sc.nextInt();
        for(int i = 0; i < k; i++) {
            if(i%2 == 0) {
                if(a%2 == 1) a--;
                b = b + a/2;
                a = a/2;
            } else {
                if(b%2 == 1) b--;
                a = a + b/2;
                b = b/2;
            }
        }
        System.out.println(a+" "+b);
    }
}