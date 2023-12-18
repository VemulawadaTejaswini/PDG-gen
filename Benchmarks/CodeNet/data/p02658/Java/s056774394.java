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
        Arrays.sort(ary);
        long ans = 1;
        for(int i=0; i<n; i++){
            ans *= ary[i];
            if(ans > 1000000000000000000L){
                ans = -1;
                break;
            }
        }
        System.out.println(Long.toString(ans));
    }
}