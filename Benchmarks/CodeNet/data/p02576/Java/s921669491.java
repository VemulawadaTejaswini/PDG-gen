import java.util.*;
import java.lang.Math;
public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int T = sc.nextInt();
        int takoyaki = 0;
        int time = 0;
        while(takoyaki < N){
            takoyaki += X;
            time += T;
            }
        System.out.println(time);
    }
}
