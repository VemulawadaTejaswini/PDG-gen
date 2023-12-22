import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc =new Scanner(System.in);
        long[] line =new long[4];
        for (int i = 0; i < 4; i++) {
            line[i] = sc.nextLong();  
        }
        long max = Long.MIN_VALUE;
        
        for (int i = 0; i < 2; i++) {
            for (int j = 2; j < 4; j++) {
                max = Math.max(max, line[i]*line[j]);
            }
        }

        System.out.println(max);
		sc.close();
    }
}
