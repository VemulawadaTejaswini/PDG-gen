import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] x = new int[n];
        for(int i = 0; i < n; i++) x[i] = scan.nextInt();
        int out = Integer.MAX_VALUE;
        for(int i = 1; i <= 100; i++){
            int sum = 0;
            for(int j = 0; j < n; j++){
                sum += Math.pow(x[j] - i, 2);
            }
            if(out > sum) out = sum;
        }
        System.out.println(out);
        scan.close();
    }
}
