import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        long Sum = 0;
        
        for(int i=1; i<=N; i++){
            if(!(i%3==0||i%5==0||i%15==0)){
                Sum += i;
            }
        }
    
        System.out.println(Sum);
    }
}
