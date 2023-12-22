import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N, K;
        N = sc.nextInt(); K = sc.nextInt();
        int h, cont = 0;
        for (int i=0; i<N; i++){
            h = sc.nextInt();
            if (h >= K) cont++;
        }
        System.out.println(cont);
    }
}