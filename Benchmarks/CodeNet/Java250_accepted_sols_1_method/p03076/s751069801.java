import java.util.*;

public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        int min = 10;
        int minIndex = 0;
        for (int i = 0; i<5; i++) {
            a[i] = sc.nextInt();
            if (a[i]%10 != 0 && a[i]%10 < min) {
                min = a[i]%10;
                minIndex = i;
            } 
        }

        int result =0;
        if (min == 10) {
            for (int i = 0; i<5; i++) {
                result += a[i];
            }
        }
        else {
            for (int i = 0; i<5; i++) {
                result += a[i];
                if (a[i]%10 != 0 && i != minIndex) {
                    result += (10 - a[i]%10);
                }
            }
        }

        System.out.println(result);
        sc.close();
    }
}