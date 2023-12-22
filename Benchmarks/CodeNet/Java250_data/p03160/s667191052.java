import java.util.*;
public class Main {
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int[] h = new int[n];
                for(int i = 0 ; i < n ; i++){
                        h[i] = sc.nextInt();
                }
                sc.close();
                int[] q = new int[n];
                Arrays.fill(q , 0);
                q[1] = Math.abs(h[1] - h[0]);
                for(int i = 2 ; i < n ; i++){
                        q[i] = Math.min(q[i - 1] + Math.abs(h[i - 1] - h[i]) , q[i - 2] + Math.abs(h[i - 2] - Math.abs(h[i])));
                }
                System.out.println(q[n - 1]);
        }
}