import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextLong();
        long max =1;
        for(long i =1; i*i<=N; i++){
            if(N%i == 0){
                max = i;
            }
        }   
        
        long answer = max + (N/max) -2;
        
        System.out.println(answer);
        
    }
}
