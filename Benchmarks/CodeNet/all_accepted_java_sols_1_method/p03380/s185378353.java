import java.util.*;
public class Main {
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int[] a = new int[n];
                for(int i = 0 ; i < n ; i++){
                        a[i] = sc.nextInt();
                }
                sc.close();
                Arrays.sort(a);
                int yono = 0;
                for(int i = 0 ; i < n - 1 ; i++){
                        if(Math.abs(a[n - 1] - 2 * a[yono]) > Math.abs(a[n - 1] - 2 * a[i])) yono = i;
                }
                System.out.println(a[n - 1] + " " + a[yono]);
        }
}