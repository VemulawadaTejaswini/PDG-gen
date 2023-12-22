import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long X = sc.nextLong();
        long Y = sc.nextLong();
        long ans = 0;
        while(true){
            if(X <= Y){
                ans++;
                X *= 2;
            }else{
                break;
            }
        }
        System.out.println(ans);
    }
}