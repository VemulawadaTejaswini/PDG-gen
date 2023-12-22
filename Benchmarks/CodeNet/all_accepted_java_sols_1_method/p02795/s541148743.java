import java.util.*;

public class Main{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int w = sc.nextInt();
        int n = sc.nextInt();

        int ans = 0;

        if (h>w){
            int cnt = 0;
            while (n>0){
                if (cnt<w){
                    cnt++;
                    ans++;
                    n -= h;
                }else {
                    n -= (h - w);
                    ans++;
                }
            }
        }else {
            int cnt = 0;
            while (n>0){
                if (cnt<h){
                    cnt++;
                    ans++;
                    n -= w;
                }else {
                    n -= (h - h);
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}
