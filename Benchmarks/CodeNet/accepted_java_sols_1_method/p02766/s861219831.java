import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);        

        int N = sc.nextInt();
        int K = sc.nextInt();
        
        int count=1;
        while(N>=K){
            N = N / K;
            count++;
        }

        System.out.println(count);
    }
}
