import java.util.*;
import java.awt.*;

class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(sc.next());
        int[] p = new int[n];
        int ans=0;
        for(int i = 0; i < n; i++){
            p[i] = Integer.parseInt(sc.next());
        }
        for(int i = 1; i < n-1; i++){
            if(p[i-1] < p[i] && p[i] < p[i+1]){
                //System.out.println(p[i]);
                ans++;
            }else if(p[i+1] < p[i] && p[i] < p[i-1]){
                //System.out.println(p[i]);
                ans++;
            }
        }
        System.out.println(ans);
    }
}
