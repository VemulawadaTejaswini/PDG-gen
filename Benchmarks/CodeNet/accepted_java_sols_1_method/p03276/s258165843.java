import java.util.*;
import java.io.*;
public class Main{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                PrintWriter ou = new PrintWriter(System.out);
                int n = Integer.parseInt(sc.next());
                int k = Integer.parseInt(sc.next()) - 1;
                int[] x = new int[n];
                for(int i = 0 ; i < n ; i++){
                        x[i] = Integer.parseInt(sc.next());
                }
                sc.close();
                long[] q = new long[n - k];
                for(int i = 0 ; i < n - k ; i++){
                        if(x[i] < 0 && x[i + k] > 0) q[i] = Math.min(-x[i] , x[i + k]) - x[i] + x[i + k];
                        else q[i] = Math.max(Math.abs(x[i]) , Math.abs(x[i + k]));
                }
                Arrays.sort(q);
                ou.print(q[0] + "\n");
                ou.flush();
        }
}