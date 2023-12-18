import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = 0;
        if (n % 1000 != 0) res = 1000 - n % 1000;
        System.out.println(res);
    }
}