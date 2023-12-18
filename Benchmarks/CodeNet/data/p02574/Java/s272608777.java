import java.util.HashSet;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
    
        var sc = new Scanner(System.in);
    
        int n = Integer.parseInt(sc.next());
        var a = new int[n];
        var set = new HashSet<Integer>();
        for(int i = 0; i < n; i++){
            a[i] = Integer.parseInt(sc.next());
            set.add(a[i]);
        }
        
        boolean b = true;
        if(set.size() < n){
            b = false;
        }else{
            var set2 = new HashSet<Integer>();
            for(int i = 0; i < n; i++){
                int sqrt = (int)Math.sqrt(a[i]+1);
                int x = a[i];
                while(x%2 == 0){
                    x /= 2;
                    set2.add(2);
                }
                for(int j = 3; j <= sqrt; j += 2){
                    while(x%j == 0){
                        x /= j;
                        set2.add(j);
                    }
                }
                for(int j : set2){
                    for(int k = i+1; k < n; k++){
                        if(a[k] % j == 0){
                            b = false;
                            break;
                        }
                    }
                }
            }
        }
        
        if(b){
            System.out.println("pairwise coprime");
        }else{
            long gcd = gcd(a[0], a[1]);
            for(int i = 2; i < n; i++){
                gcd = gcd(gcd, a[i]);
            }
            if(gcd == 1){
                System.out.println("setwise coprime");
            }else{
                System.out.println("not coprime");
            }
        }
    }
    
    static long gcd(long a, long b){
        return b == 0 ? a : gcd(b, a%b);
    }
}