import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = sc.nextInt();
        int ans = 0;

        for(int i = 0; i < n; i++){
            String ts = sc.next();
            ts += ts;

            if(ts.contains(s)){
                ans++;
            }
        }

        System.out.println(ans);
    }
}