import java.util.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //String str = sc.next();
        int N = sc.nextInt();
        int[] h = new int[N];
        int count = 0;
        int max = 0;
        
        for(int i=0; i<N; i++){
            h[i] = sc.nextInt();
            if(i>0){
                if(h[i-1] >= h[i]){
                    count++;
                    if(max < count){
                        max = count;
                    }
                }else{
                    count = 0;
                }
            }
        }
        
        System.out.println(max);
        
    }
}
