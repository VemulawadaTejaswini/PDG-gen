import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        int count = 1;
        for (int i=1;i<=n;i++){
            if (sc.nextInt()!=count){
                ans++;
                count--;
            }
            count++;
        }
        if (ans==n)System.out.println(-1);
        else System.out.println(ans);
    }
}
