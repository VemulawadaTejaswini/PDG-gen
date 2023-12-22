import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        long x = n * (n - 1) / 2;
        long y = m * (m - 1) / 2;

        System.out.println(x + y);

    }

}
