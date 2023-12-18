import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        
        long min = Long.MAX_VALUE;
        long x = 0;
        long y = 0;
        for(long i = 1; i*i <= N; i++){
            if(i + (N / i) < min && N % i == 0){
                min = i + (N / i);
                x = i;
                y = N / i;
            }
        }

        System.out.println(x - 1 + y - 1);        
    }
}