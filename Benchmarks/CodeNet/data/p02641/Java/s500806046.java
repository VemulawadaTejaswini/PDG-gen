import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int N = sc.nextInt();
        int[] p = new int[N];
        int[] ans = new int[100];
        int min = 1000;
        int result = X;
        for(int i=1;i<=100;i++){
            ans[i-1] = Math.abs(X-i);
        }
        for(int i=0;i<N;i++){
            int num = sc.nextInt();
            ans[num-1] = 1000;
        }
        for(int i=0;i<100;i++){
            if(min>ans[i])
            {
                min = ans[i];
                result = i+1;
            }
        }
        System.out.println(result);
    }
}