import java.util.*;
public class Main {
    public static long countDivisors(long n ){
        long count=0;
        for(long i=1;i<=Math.sqrt(n);i++){
            if((n%i) == 0){
                if(i == (n/i))
                    count++;
                else
                    count+=2;
            }
        }
        return count;
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       long n = sc.nextLong();

       long ans = 0;
        for (int i = 0; i < n; i++) {
            ans += ((i+1)*(countDivisors(i+1)));
        }
        System.out.println(ans);
    }
}
