import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        int ans = 0;
        for(int i = 0;i<n;i++){
            int h = Integer.parseInt(sc.next());
            if(h>=k){
                ans++;
            }
        }
        System.out.println(ans);
    }
}