import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long N  = sc.nextLong();
        int limit = (int)Math.sqrt(N);
        long min = N;
        for(int i = 1; i <= limit; i++){
            if(N % i == 0) {
            long j = N/i;
            min = Math.min(min, i + j -2);
            }
        }
        System.out.println(min);
    }
}