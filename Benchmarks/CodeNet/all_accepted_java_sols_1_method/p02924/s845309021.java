import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        long N = sc.nextInt();
        long counter = N*(N+1)/2 - N;
        
        System.out.println(counter);
    }
}