import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = -1000; i <= 1000; i++) {
            for (int j = -1000; j <= 1000; j++) {
                long tmp = i;
                for (int k = 0; k < 4; k++) {
                    tmp *= i;
                }
                long tmp2 = j;
                for (int k = 0; k < 4; k++) {
                    tmp2 *= j;
                }
                
                if (tmp - tmp2 == n) {
                    // System.out.println(tmp);
                    // System.out.println(tmp2);
                    System.out.println(i + " " + j);
                    return;
                }
            }
        }
    }
}
