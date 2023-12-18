import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        long N = Long.parseLong(sc.next());
        long ans = 0;
        long sqrt = (int)Math.sqrt(N);
        
        if(sqrt * sqrt == N){
            ans = N;
        }else{
            ans = sqrt * sqrt;
        }
        
        System.out.println(ans);
    }
}