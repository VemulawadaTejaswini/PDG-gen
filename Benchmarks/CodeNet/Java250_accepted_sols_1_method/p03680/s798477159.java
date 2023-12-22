import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i=0; i<n; i++) {
            array[i] = sc.nextInt();
        }
        int point = 1;
        int count = 0;
        while (point != 2 && count < n) {
            point = array[point-1];
            count++;
        }
        System.out.println(count==n?-1:count);
    }
}