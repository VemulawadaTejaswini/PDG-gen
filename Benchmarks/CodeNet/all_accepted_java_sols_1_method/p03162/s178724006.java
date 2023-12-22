import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();

        long dp1[] = new long[num1+1];
        long dp2[] = new long[num1+1];
        long dp3[] = new long[num1+1];

        dp1[0] = dp2[0] = dp3[0] = 0;
                
        for(int i=1; i<num1+1; i++){
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
            
            dp1[i] = Math.max(a + dp2[i-1], a + dp3[i-1]);
            dp2[i] = Math.max(b + dp1[i-1], b + dp3[i-1]);
            dp3[i] = Math.max(c + dp1[i-1], c + dp2[i-1]);
        }
        

        System.out.println(Math.max(Math.max(dp1[num1],dp2[num1]), dp3[num1]));
    }
}