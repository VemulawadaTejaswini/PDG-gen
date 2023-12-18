import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] array = new int[10][10];
        
        
        for (int i = 1; i <= n; i++) {
            if (i % 10 == 0) continue;
            int a = -1;
            int b = -1;
            if (i < 10) {
                a = i;
                b = i;
            } else {
                String str = String.valueOf(i);
                a = Integer.parseInt(String.valueOf(str.charAt(0)));
                b = Integer.parseInt(String.valueOf(str.charAt(str.length() - 1)));
            }
            
            array[a][b]++;
        }
        
        int count = 0;
        for (int i = 1; i < 10; i++) {
            for (int j = i; j < 10; j++) {
                count += array[i][j] * array[j][i];
                if (i != j) {
                    count += array[i][j] * array[j][i];
                }
            }
        }
        
        System.out.println(count);
    }
}
