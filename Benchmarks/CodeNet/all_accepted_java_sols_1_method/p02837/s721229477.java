import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] x = new int[n][n];
        int[][] y = new int[n][n];
        
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            for (int j = 0; j < a; j++) {
                x[i][j] = sc.nextInt() - 1;
                y[i][j] = sc.nextInt();
            }
            x[i][a] = 999;
            y[i][a] = 999;
        }
        
        int combinationCount = (int)Math.pow(2, n);
        int max = 0;
        for (int i = 0; i < combinationCount; i++) {
            boolean ng = false;
            int count = 0;
            String binaryNumber = Integer.toBinaryString(i);
            while (binaryNumber.length() < n) {
                binaryNumber = "0" + binaryNumber;
            }
            
            for (int j = 0; j < n; j++) {
                int num = Integer.valueOf(String.valueOf(binaryNumber.charAt(j)));
                
                if (num == 1) {
                    for (int k = 0; k < n; k++) {
                        if (x[j][k] == 999) break;
                        
                        if (y[j][k] != Integer.valueOf(String.valueOf(binaryNumber.charAt(x[j][k])))) {
                            ng = true;
                        }
                    }
                }
            }
            
            if (!ng) {
                for (int j = 0; j < n; j++) {
                    if (Integer.valueOf(String.valueOf(binaryNumber.charAt(j))) == 1) {
                        count++;
                    }
                }
                
                max = Math.max(max, count);
            }
        }
        
        System.out.println(max);
    }
}
