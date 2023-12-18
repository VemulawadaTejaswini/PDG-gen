import java.util.Arrays;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        long[] ary = new long[n];
        for(int i=0; i<n; i++){
            ary[i] = sc.nextLong();
        }
        long ans = 1;
        Arrays.sort(ary);
        //System.out.println(Arrays.toString(ary));
        for (long i : ary) {
            ans *= i;
            if(ans > (long)Math.pow(10, 18)){
                ans = -1;
                break;
            }
        }
        System.out.println(ans);
    }
}