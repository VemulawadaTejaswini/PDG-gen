import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int x = sc.nextInt();
        for(int i = 0; i < n; i++){
            int a = sc.nextInt();
            x += (d-1)/a + 1;
        }

        System.out.println(x);
    }
}
