import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int[][] array = new int[m][2];
        for (int i = 0; i < m; i++) {
            array[i][0] = sc.nextInt();
            array[i][1] = sc.nextInt();
        }
        Arrays.sort(array, (a, b) -> Integer.compare(a[0], b[0]));
        
        int nowl = -1;
        int nowr = 1000000;
        
        int count = 1;
        for (int i = 0; i < m; i++) {
            if (count == n - 1) break;
            int l = array[i][0];
            int r = array[i][1];
            
            if (r <= nowl || nowr <= l) {
                count++;
                nowl = l;
                nowr = r;
                continue;
            }
            
            if (nowl < l) {
                nowl = l;
            }
            if (r < nowr) {
                nowr = r;
            }
        }
        
        System.out.println(count);
    }
}
