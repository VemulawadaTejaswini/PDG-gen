import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] tests1 = new int[4];
        int tests1_min = 101;
        int tests1_sum = 0;

        for (int i = 0; i < tests1.length; i++) {
            tests1[i] = sc.nextInt();
        }
        
        for (int i = 0; i < tests1.length; i++) {
            tests1_min = Math.min(tests1_min, tests1[i]);
        }
        
        for (int i = 0; i < tests1.length; i++) {
            tests1_sum += tests1[i];
        }
        
        int tests1_3max = tests1_sum - tests1_min;
        
        int rekisi = sc.nextInt();
        int tiri = sc.nextInt();
        int test2 = Math.max(rekisi, tiri);
        
        System.out.println(tests1_3max + test2);
    }
}
