import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] array = new long[n];
        long sum = 0;
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextLong();
            sum += array[i];
        }
        
        long left = array[0];
        long right = array[n - 1];
        
        int leftindex = 1;
        int rightindex = n - 2;
        
        if (n == 2) {
            System.out.println(Math.abs(right - left));
            return;
        }
        
        while (leftindex <= rightindex) {
            if (left < right) {
                left += array[leftindex];
                leftindex++;
                //System.out.println(left);
                //System.out.println(right);
            } else {
                right += array[rightindex];
                rightindex--;
                //System.out.println(left);
                //System.out.println(right);
            }
        }
        
        
        System.out.println(Math.abs(right - left));
    }
}
