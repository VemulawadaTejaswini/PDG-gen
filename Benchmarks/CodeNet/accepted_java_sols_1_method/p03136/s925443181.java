import java.util.*;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int sum = 0;
        for(int i = 0; i < n; i++){
            x[i] = sc.nextInt();
        }
        Arrays.sort(x);
        for(int i = 0; i < n-1; i++){
            sum += x[i];
        }
        String ans = "No";
        if(sum > x[n-1]){
            ans = "Yes";
        }
        System.out.println(ans);
    }
}
