import java.util.*;
public class Main {
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int k = sc.nextInt();
                int[] h = new int[n];
                for(int i = 0 ; i < n ; i++){
                        h[i] = sc.nextInt();
                }
                sc.close();
                int[] q = new int[n];
                Arrays.fill(q , (int)Math.pow(10 , 9));
                q[0] = 0;
                for(int i = 1; i < n ; i++){
                        for(int j = 1 ; j <= Math.min(k , i) ; j++){
                                q[i] = Math.min(q[i] , q[i - j] + Math.abs(h[i] - h[i - j]));
                        }
                }
                System.out.println(q[n - 1]);
        }
}