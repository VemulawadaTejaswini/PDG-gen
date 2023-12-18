import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }
        int ans = 0;
        for(int i=0;i<N;i++){
            for(int j=i+1;j<N;j++){
                ans += arr[i]*arr[j];
            }
        }
        System.out.println(ans);
    }
}
