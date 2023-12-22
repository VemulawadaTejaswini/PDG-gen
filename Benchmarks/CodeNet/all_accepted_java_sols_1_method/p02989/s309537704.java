import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        
        int count = 0;
        Arrays.sort(array);
        int a = array[n / 2 - 1];
        int b = array[n / 2];
        
        if (a == b) {
            System.out.println(0);
        } else {
            System.out.println(b - a);
        }
    }
}
