import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.next());


        int ans = 0;
        for(int i=1; i<=N; i++){
            ans += i;
        }

        System.out.println(ans);
    }
}
