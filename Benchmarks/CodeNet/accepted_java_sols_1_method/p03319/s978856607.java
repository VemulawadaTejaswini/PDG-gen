import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int N=sc.nextInt()-1,K=sc.nextInt()-1;
        
        System.out.println((N+K-1)/K);
    }
}
