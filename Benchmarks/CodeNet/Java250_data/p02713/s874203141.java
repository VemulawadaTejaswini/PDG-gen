import java.util.*;
 
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
 
        int N = sc.nextInt();
        int res = 0;
        
        for(int a = 1; a <= N; ++a){
            for(int b = 1; b <= N; ++b){
                for(int c = 1; c <= N; ++c){
                    res += greatestCommonFactor(a, b, c);
                }
 
            }
        }
        System.out.println(res);
    }
    
    private static int greatestCommonFactor(int a, int b, int c)
    {
        int limit = Math.min(a, b);
        limit = Math.min(limit, c);
        for(int n = limit; n >= 2; n--)
        {
            if ( (a % n == 0) && (b % n == 0) && (c % n == 0) ) {
                return n;
            }
        }
        return 1;
    }
}