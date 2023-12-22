import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int ans = 0;
        for (int i = 0; i < 10; i++) {
            int idx1 = s.indexOf(String.valueOf(i));
            if(idx1 < 0)continue;
            for (int j = 0; j < 10; j++) {
                int idx2 = s.indexOf(String.valueOf(j), idx1+1);
                if(idx2 < 0)continue;
                for (int k = 0; k < 10; k++) {
                    int idx3 = s.indexOf(String.valueOf(k), idx2+1);
                    if(idx3 < 0)continue;
                    ans++;
                }
            }
        }
        System.out.println(ans);
        sc.close();

    }

}
