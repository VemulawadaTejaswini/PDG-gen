import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int cnt = 0;
        for (int i=0;i<N;i++) {
            int a = Integer.parseInt(sc.next());
            if (cnt+1==a) cnt++;
        }
        if (cnt==0) {
            System.out.println(-1);
        } else {
            System.out.println(N-cnt);
        }
    }
}