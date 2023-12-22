import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
 
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(); int X= in.nextInt();
 
        int[] cost = new int[N];
 
        for(int i = 0; i < N; i++){
            cost[i] = in.nextInt();
            X-=cost[i];
        }
 
 
        Arrays.sort(cost);
 
        int add = 0;
        while(X >= cost[0]) {
            add++;
            X-=cost[0];
        }
 
        System.out.println(N + add);
 
    }
}