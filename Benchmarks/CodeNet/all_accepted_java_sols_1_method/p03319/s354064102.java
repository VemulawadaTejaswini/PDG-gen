import java.util.*;
public class Main{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int k = sc.nextInt();
                int[] a = new int[n];
                int sai = 0;
                for(int i = 0 ; i < n ; i++){
                        a[i] = sc.nextInt();
                        if(a[sai] > a[i]) sai = i;
                }
                System.out.println((int)(Math.ceil((n - 1) * 1.0 / (k - 1))));
        }
}
//条件間違えていました