import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int T = sc.nextInt();
        int result = 0;
        while(N>0) {
            result+=T;
            N-=X;
        }
        System.out.println(result);
    }
}
