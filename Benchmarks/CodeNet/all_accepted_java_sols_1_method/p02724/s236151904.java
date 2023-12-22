import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int a = x/500;
        int b = (x%500)/5;
        int ans = 1000*a + 5*b;
        System.out.println(ans);

    }
}