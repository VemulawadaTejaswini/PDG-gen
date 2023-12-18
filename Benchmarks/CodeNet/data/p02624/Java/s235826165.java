import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long a[] = new long[n+1];
        Arrays.fill(a,1);
        
        for(int i=2;i<=n;i++){
            for(int j=1;;j++){
                if(i*j <= n){
                    a[i*j]++;
                }else{
                    break;
                }
            }
        }
        
        long sum = 0;
        for(int i = 1;i<=n;i++){
            sum += i*a[i];
        }
        
        System.out.println(sum);
    }
}

class Monmo {
}

