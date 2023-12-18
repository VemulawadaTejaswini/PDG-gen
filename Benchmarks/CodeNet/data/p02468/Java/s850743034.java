import java.util.*;
public class Main{
    public static void main(String[] args){
        new Main().run();
    }
    Scanner sc = new Scanner(System.in);
    long m, n;
    long INF = 1000000007;
    
    void run(){
        while(sc.hasNext()){
            m = sc.nextLong();
            n = sc.nextLong();
            if(m!=0 && n!=0) 
                System.out.println(solve(m, n));
        }
    }
    
    long solve(long m, long n){
        if(n==0)
            return 1;
        
        if(n%2==0){
            long a = solve(m, n/2);
            if(a>=INF) a %= INF;
            a = a*a;
            if(a>=INF) a %= INF;
            return a;
        }
        else{
            long a = solve(m, n/2);
            if(a>=INF) a %= INF;
            a = a*a%INF*m%INF;
            if(a>=INF) a %= INF;
            return a;
        }
    }
}