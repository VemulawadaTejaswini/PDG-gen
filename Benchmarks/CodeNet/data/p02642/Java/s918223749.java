import java.util.*;
import java.util.function.*;
import java.lang.*;
import java.io.*;
class MathLib{
    static long gcd(long a, long b){
        if(a<0) a = -a;
        if(b<0) b = -b;
        if(a>b){
            long t = a;
            a = b;
            b = t;
        }
        while(a>0){
            long r = b%a;
            b = a;
            a = r;            
        }
        return b;
    }
    
    static boolean isPrime(long N){
        if(N%2==0) return false;
        for(long i=3; i*i<=N; i+=2){
            if(N%i==0) return false;
        }
        return true;
    }
    static List<Long> divisorList(long N){
        LinkedList<Long> ans = new LinkedList<>();
        for(long i=3 + (long)(Math.sqrt(N)); i>0; i--){
            if(i*i>N) continue;
            if(i*i==N) ans.add(i);
            else if(N%i==0){
                ans.addFirst(i);
                ans.addLast(N/i);
            }
        }
        return ans;
    }
    static List<Integer> primeList(int max){
        boolean[] prime = new boolean[max+1];
        Arrays.fill(prime, true); prime[0]=false; prime[1]=false;
        ArrayList<Integer> list = new ArrayList<>();
        for(int n=2; n<=max; n++) if(prime[n]){
            list.add(n);
            if(n*n<=max) for(int m=2*n; m<=max; m+=n) prime[m]=false;
        }
        return list;
    }
}
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for(int n=0; n<N; n++) A[n]=sc.nextInt();
        Arrays.sort(A);

        int ans = 0;
        boolean[] canBeUsed = new boolean[1000001];
        Arrays.fill(canBeUsed, true);
        for(int n=0; n<N; n++){
            boolean proper = true;
            if(n-1>=0 && A[n]==A[n-1]) proper = false;
            if(n+1<N && A[n]==A[n+1]) proper = false;
            proper &= canBeUsed[A[n]];
            if(proper){
                ans++;
                for(int d=2; A[n]*d<=1000000; d++) canBeUsed[A[n]*d]=false;
            }
        }
        
        System.out.println(ans);
    }
}
