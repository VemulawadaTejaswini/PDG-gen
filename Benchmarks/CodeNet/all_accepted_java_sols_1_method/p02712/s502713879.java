import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int n = in.nextInt();
        long ans = 0;
        for(int i=1;i<=n;++i){
            if(i%15==0||i%3==0||i%5==0)continue;
            ans+=i;
        }
        System.out.println(ans);
    }
}
