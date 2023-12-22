import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int k = sc.nextInt();
        int t = k;
        int b = x;

        while(x < n){
            x += b;
            k += t;

        }
        System.out.println(k);
    }
}