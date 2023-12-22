import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n - 1; i++) {
            int num = sc.nextInt() - 1;
            array[num]++;
        }
        
        for (int i = 0; i < n; i++) {
            System.out.println(array[i]);
        }
    }
}
