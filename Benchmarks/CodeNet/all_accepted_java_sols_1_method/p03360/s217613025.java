import java.util.*;

public class Main{

    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);

        int a,b,c,k,max,max_;
        a = Integer.parseInt(scan.next());   
        b = Integer.parseInt(scan.next());
        c = Integer.parseInt(scan.next());
        k = Integer.parseInt(scan.next());
        max = Math.max(a,b);
        max = Math.max(max,c);
        max_ = max;
        for(int i = 0;i < k;i++){
            max = max*2;
        }
        int ans;
        ans = max + a + b + c - max_;

        System.out.println(ans);
    }
}