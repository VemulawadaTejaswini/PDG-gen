import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long H = sc.nextLong();
        long monsters = 1;
        long sum = 0;
        while(H > 0){
            H /= 2;
            sum += monsters;
            monsters *= 2;
        }
        
        System.out.println(sum);
    }
}