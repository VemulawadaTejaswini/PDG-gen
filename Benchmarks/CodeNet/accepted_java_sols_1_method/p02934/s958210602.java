import java.util.*;
import java.lang.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double ans = 0;
        for(int n=0; n<N; n++) ans += 1/sc.nextDouble();
        System.out.println(1/ans);


    }
}