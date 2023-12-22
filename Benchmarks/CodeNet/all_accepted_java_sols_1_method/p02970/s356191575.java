import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int D = sc.nextInt();
        
        double X = (double) N / ( D * 2 + 1);
        X = Math.ceil(X);
        
        System.out.println((int)X);
    }
}
