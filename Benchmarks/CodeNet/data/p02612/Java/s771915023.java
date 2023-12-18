import java.util.*;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int res = 0;
        if (n % 1000 != 0) {
            res = n - ((n/1000) + 1) * 1000;   
        }
        System.out.println(-res);
    }
}