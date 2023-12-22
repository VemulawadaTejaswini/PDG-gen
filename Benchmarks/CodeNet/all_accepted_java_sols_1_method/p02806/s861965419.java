import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String[] s = new String[n];
        int[] t = new int[n];

        for (int i=0; i<n; i++){
            s[i] = sc.next();
            t[i] = sc.nextInt();
        }

        String x = sc.next();

        int ans = 0;

        int tmp = 0;

        for (int i=0; i<n; i++){
            if (s[i].equals(x)){
                tmp = i;
                break;
            }
        }
        for (int i=tmp+1; i<n; i++){
            ans += t[i];
        }

        System.out.println(ans);

    }
}
