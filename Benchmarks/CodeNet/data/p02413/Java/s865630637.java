import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
         Scanner sc = new Scanner(System.in);
         int row = sc.nextInt();//row
         int col = sc.nextInt();//col
         int[] sum_v = new int[col];
         int sum_h = 0;
         int sum = 0;
         for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                int tmp = sc.nextInt();
                sum_v[j] += tmp;
                sum += tmp;
                System.out.print(tmp + " ");
            }
            sum_h += sum;
            System.out.println(sum);
            sum=0;
         }
         for(int i=0;i<col;i++){
            System.out.print(sum_v[i] + " ");
         }
         System.out.println(sum_h);
    }
}