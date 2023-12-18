import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int D = sc.nextInt();
        int ans = 0;
        for (int d = 1;d<=D;d++){
            int m = (d/10) * (d%10);
            if (0<m&&m<=M&&d/10>1&&d%10>1){
                ans++;
            }
        }
        System.out.printf("%d\n",ans);
    }
}