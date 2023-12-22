import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] array = new long[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextLong();
        }
        
        long now = array[0];
        long add = 0;
        for (int i = 1; i < n; i++) {
            if (array[i] < now) {
                add += now - array[i];
            } else {
                now = array[i];
            }
        }
        
        System.out.println(add);
    }
}
