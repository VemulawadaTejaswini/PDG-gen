import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = Integer.parseInt(sc.next());
        double hen = (double) l / 3;
        double ans = hen * hen * hen;
        System.out.println(ans);

        sc.close();
    }
}