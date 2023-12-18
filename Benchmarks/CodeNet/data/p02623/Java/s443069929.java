
import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        long k = sc.nextLong();
        long arr1[] = new long[s1];
        long arr2[] = new long[s2];
        for (int m = 0; m < s1; ++m) {
            arr1[m] = sc.nextLong();
        }
        for (int m = 0; m < s2; ++m) {
            arr2[m] = sc.nextLong();
        }

        long min = 0;
        int count = 0;
        boolean flag = false;
        int i = 0;
        int j = 0;
        for (; i < s1 && j < s2;) {
            if (arr1[i] < arr2[j] && (arr1[i] + min) <= k) {
                
                    ++count;
                    min += arr1[i];
                    ++i;
                
            } else if (arr2[j] <= arr1[i] && (arr2[j] + min) <= k) {
                    ++count;
                    min += arr2[j];
                    ++j;
            } else {    
                break;
            }

        }
            while (i < s1 && (arr1[i] + min) <= k) {
                    ++count;
                    min += arr1[i];
                    ++i;
            }
            while (j < s2 && (arr2[j] + min) <= k) {
                
                    ++count;
                    min += arr2[j];
                    ++j;
            }
        
        System.out.println(count);

    }

}