import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] array = new int[n][2];
        
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            int num2 = sc.nextInt();
            
            array[i][0] = num - num2;
            array[i][1] = num + num2;
        }
        
        Arrays.sort(array, (a, b) -> Integer.compare(a[1], b[1]));
        
        int count = 1;
        int now = array[0][1];
        for (int i = 1; i < n; i++) {
            if (now <= array[i][0]) {
                now = array[i][1];
                count++;
            }
        }
        
        System.out.println(count);
    }
}
