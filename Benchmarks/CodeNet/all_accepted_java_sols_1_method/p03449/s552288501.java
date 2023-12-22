import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int[] a = new int[cnt];
        int[] b = new int[cnt];
        for(int i = 0; i < cnt; i++){
            a[i] = sc.nextInt();
        }
        for(int i = 0; i < cnt; i++){
            b[i] = sc.nextInt();
        }
        int[] sum = new int[cnt];
        int k = 0;
        for(int i = 0; i < cnt; i++){
            sum[i] += k;
            sum[i] += a[i];
            for(int j = i; j < cnt; j++){
                sum[i] += b[j];
            }
            k += a[i];
        }
        int max = sum[0];
        for(int i = 0; i < sum.length; i++){
            max = Math.max(max, sum[i]);
        }
        System.out.println(max);
    }
}