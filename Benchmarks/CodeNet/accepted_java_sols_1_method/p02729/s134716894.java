import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int res = (m - 1) * m / 2 + (n - 1) * n / 2;

        System.out.println(res);
    }
}