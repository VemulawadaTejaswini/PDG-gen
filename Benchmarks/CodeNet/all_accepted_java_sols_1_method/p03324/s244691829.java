import java.util.*;
//import java.math.BigInteger;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //String str = sc.next();
        int D = sc.nextInt();
        int N = sc.nextInt();
        //int[] m = new int[N];
        int ans = 1;
        
        //ans = N * (int)Math.pow(100,D);
        for(int i=0; i<D; i++){
            ans = ans * 100;
        }
        
        if(N==100){
            ans = ans * (N+1);
        }else{
            ans = ans * N;
        }
        
        System.out.println(ans);
    }
}
