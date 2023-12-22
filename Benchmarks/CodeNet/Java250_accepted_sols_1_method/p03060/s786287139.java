import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] array = new int[n][2];
        for (int i = 0; i < n; i++) {
            array[i][0] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            array[i][1] = sc.nextInt();
        }
        
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int s = array[i][0] - array[i][1];
            if (s > 0) {
                sum += s;
            }
        }
        System.out.println(sum);
    }
}
