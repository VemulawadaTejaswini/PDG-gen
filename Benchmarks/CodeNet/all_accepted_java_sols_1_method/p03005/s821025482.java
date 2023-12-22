import java.util.*;
import java.lang.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        //one person: 0
        if(K==1) System.out.println(0);
        // 1, 1, ..., 1, (N-K+1)
        else System.out.println(N-K);
    }
}