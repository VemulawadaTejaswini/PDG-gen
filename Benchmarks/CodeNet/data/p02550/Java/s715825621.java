import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        long n = Long.parseLong(sc.next());
        int x = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        
        if(x == 0){
            System.out.println(0);
            return;
        }
        if(n==1){
            System.out.println(x);
            return;
        }
        
        int[] ar = new int[m*3];
        ar[1] = x;
        
        //value, index
        HashMap<Integer, Integer> h = new HashMap<>();
        int l = 0;
        int r = 0;
        
        long[] ru = new long[m*3];
        ru[1] = x;
        
        for(int i=1; i<ar.length-1; i++){
            ar[i+1] = f(ar[i], m);
            ru[i+1] = ru[i]+ar[i+1];
            if(h.containsKey(ar[i+1])){
                l = h.get(ar[i+1]);
                r = i+1;
                break;
            }else{
                h.put(ar[i+1], i+1);
            }
        }
        
        long ans = ru[l-1];
        long loopSum = ru[r] - ru[l];
        long loopLength = r-l;
        long loopTime = (n-l+1)/loopLength;
        long loopEnd = l-1+loopLength*loopTime;
        
        /*
        System.out.println("L " + l);
        System.out.println("R " + r);
        System.out.println("loopSum " + loopSum);
        System.out.println("loopLength " + loopLength);
        System.out.println("loopTime " + loopTime);
        System.out.println("loopEnd " + loopEnd);
        */
        
        ans += loopSum*loopTime;
        
        //残りは愚直
        for(int i=0; i<(int)(n-loopEnd); i++){
            ans += ar[l+i];
        }
        
        System.out.println(ans);
    }
    
    public static long mod_pow(long x, long p, long m){
        long a = 1;
        while(p>0){
            if(p%2==1){
                a = a*x%m;
            }
            x = x*x%m;
            p /= 2;
        }
        return a;
    }
    
    public static int f(int a, int m){
        long res = mod_pow(a, 2, m);
        return (int)res;
    }
}