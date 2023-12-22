import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
 
        final int n = sc.nextInt();
        long[] vec1 = new long[n];
        long[] vec2 = new long[n];
        for(int i = 0; i < n; i++){
            vec1[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            vec2[i] = sc.nextInt();
        }
         
        long m_dist = 0;
        for(int i = 0; i < n; i++){
            m_dist += Math.abs(vec1[i] - vec2[i]);
        }
        System.out.println(m_dist);
         
        long u_dist = 0;
        for(int i = 0; i < n; i++){
            u_dist += (vec1[i] - vec2[i]) * (vec1[i] - vec2[i]);
        }
        System.out.println(Math.sqrt(u_dist));
         
        long t_dist = 0;
        for(int i = 0; i < n; i++){
            t_dist += Math.abs((vec1[i] - vec2[i]) * (vec1[i] - vec2[i]) * (vec1[i] - vec2[i]));
        }
        System.out.println(Math.pow(t_dist, 1 / 3.0));
         
        long c_dist = 0;
        for(int i = 0; i < n; i++){
            c_dist = Math.max(c_dist, Math.abs(vec1[i] - vec2[i]));
        }
        System.out.println(c_dist);
    }
}
