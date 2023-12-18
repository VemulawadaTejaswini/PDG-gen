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
        
        int[] array2 = new int[n];
        for (int i = 0; i < n; i++) {
            array2[i] = array[i];
        }
        
        Arrays.sort(array);
        
        int highmedian = array[n/2];
        int lowmedian = array[n/2-1];
        
        
        for (int i = 0; i < n; i++) {
            if (array2[i] >= highmedian) {
                System.out.println(lowmedian);
            } else {
                System.out.println(highmedian);
            }
        }
    }
}