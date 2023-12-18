import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] x = new int[n];
        int max = 0;
        for(int i = 0; i < n; i++){
            x[i] = scan.nextInt();
            if(max < x[i]) max = x[i];
        }
        int out = Integer.MAX_VALUE;
        int sum = 0;
        for(int i = 1; i <= max; i++){
            for(int j = 0; j < n; j++){
                sum += (int)Math.pow(x[j] - i, 2);
            }
            if(out > sum) out = sum;
            sum = 0;
        }
        System.out.println(out);
    }
}