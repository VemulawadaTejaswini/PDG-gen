import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] n = new long[N];
        long sum = 1;
        
        for(int i=0; i<N; i++){
            n[i] = sc.nextLong();
            sum *= n[i];
        }
        
        
        if(sum > (int)Math.pow(10,18)){
            System.out.println(-1);
        }else{
            System.out.println(sum);
        }
    }
}