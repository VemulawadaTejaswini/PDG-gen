import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] array = new int[n - 1][3];
        int[] ans = new int[n];
        
        for (int i = 0; i < n - 1; i++) {
            array[i][0] = sc.nextInt();
            array[i][1] = sc.nextInt();
            array[i][2] = sc.nextInt();
        }
        
        for (int i = 0; i < n - 1; i++) {
            int t = 0;
            for (int j = i; j < n - 1; j++) {
                if (t > array[j][1]) {
                    int a = (t - array[j][1]) / array[j][2];
                    if ((t - array[j][1]) % array[j][2] != 0) {
                        a++;
                    }
                    t = array[j][1] + array[j][2] * a + array[j][0];
                } else {
                    t = array[j][1] + array[j][0];
                }
            }
            
            System.out.println(t);
        }
        System.out.println(0);
    }
}
