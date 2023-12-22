import java.util.*;
public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long total=0;
        for(int i=1; i<=N; i++){
            for(int j=1; j<=N; j++){
                for(int k=1; k<=N; k++){
                    total += gcd(gcd(i,j),k);
                }
            }
        }
        System.out.println(total);
    }

    static long gcd(long x, long y){
        if(0 == y){
            return x;
        }
        return gcd(y, x%y); 
    }
}