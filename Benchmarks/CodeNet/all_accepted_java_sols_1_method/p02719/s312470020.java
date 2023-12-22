import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long K = sc.nextLong();
            if(N%K < K - N%K){
                System.out.println(N%K);
            }else{
                System.out.println(K-N%K);
            }
    }
} 