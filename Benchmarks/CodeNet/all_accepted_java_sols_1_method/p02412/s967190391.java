import java.util.*;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        while(sc.hasNext()) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int ret = 0;
            if (n==0&&x==0) break;
            for (int i=1; i<=n; i++) {
                for (int j=i+1; j<=n; j++) {
                    for (int k=j+1; k<=n; k++) {
                        if (i+j+k==x) ret++;
                    }
                }
            }
            
            System.out.println(ret);
        }
    }
}