import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int patarn = K;

        for(int i = 1 ; i < N; i++){
            patarn = patarn * (K-1);
        }
        
        System.out.println(patarn);
    }
}