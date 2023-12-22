import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long X = sc.nextLong();
        long Y = sc.nextLong();
        long ans = 1;
        while(X*2<=Y){
            ans += 1;
            X = X*2;
        }
        System.out.println(ans);
    }
}