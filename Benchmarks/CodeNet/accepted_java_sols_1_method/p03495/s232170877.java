import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] ary = new int[n];
        int[] nums = new int[n];
        int sum = 0;
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
            ary[nums[i]-1]++;
        }
        Arrays.sort(ary);
        for(int i = n-1; i >= n-k; i--){
            sum += ary[i];
        }
        System.out.println(n-sum);
    }
}
