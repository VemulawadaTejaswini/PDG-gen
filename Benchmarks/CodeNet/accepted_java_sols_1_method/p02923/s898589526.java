import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        int[] h = new int[n];
        for (int i = 0; i < n; i++) h[i] = sc.nextInt();
        int tmp = 0;
        for (int i = 1; i < n; i++) {
            if(h[i-1] < h[i]){
                if(ans < tmp) ans = tmp;
                tmp = 0;
            }else{
                tmp++;
            }
        }
        if(ans < tmp) ans = tmp;
        System.out.println(ans);
        sc.close();

    }

}
