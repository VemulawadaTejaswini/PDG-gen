import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long sum = 1;
        
        for(int i=0; i<N; i++){
            sum *= sc.nextLong();
        }
        
        if(sum > (long)Math.pow(10,18)){
            System.out.println("-1");
        }else{
            System.out.println((long)sum);
        }
    }
}