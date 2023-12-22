import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int ans = 0;
        for(int n=1; n<=N; n++){
            if(Integer.toString(n).length()%2==1) ans++;
        }
        System.out.println(ans);
    }
}
