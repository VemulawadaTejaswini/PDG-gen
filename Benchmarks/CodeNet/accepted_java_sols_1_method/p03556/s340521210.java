import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long num = 0;
        num = (long)Math.sqrt(N);
        long ans = 0;
        long total = 0;
        for(int i =1; i < num+1; i++){
            ans = i * i;
        }
        if(ans == N){
            System.out.println(ans);
            return;
        }else{
            total = ans;
        }
        System.out.println(total);
    }
}