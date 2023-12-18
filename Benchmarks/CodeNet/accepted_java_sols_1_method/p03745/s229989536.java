import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a= new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int count = 0;
        Boolean isUp = null;
        for (int i = 0; i < n-1; i++) {
            if (isUp == null) {
                if (a[i] < a[i + 1]) {
                    isUp = true;
                }
                if (a[i] > a[i + 1]) {
                    isUp = false;
                }
            } else {
                if (isUp && a[i] > a[i + 1]) {
                    isUp = null;
                    count++;
                } else if (!isUp && a[i] < a[i + 1]) {
                    isUp = null;
                    count++;
                }
            }
        }

        System.out.println(count+1);
    }
}