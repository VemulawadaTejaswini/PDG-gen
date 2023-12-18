import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        while(true){
            int n = sc.nextInt();
            if(n == 0) break;
            int[] x = new int[n]; 
            int sum = 0;
            int ave;
            for(int i = 0; i<n; i++){
                x[i] = sc.nextInt();
            }
            Arrays.sort(x);
            for(int i = 1; i<n-1; i++){
                sum += x[i];
            }
            ave = sum/(n-2);
            System.out.println(ave);
        }
        sc.close();
    }
}
