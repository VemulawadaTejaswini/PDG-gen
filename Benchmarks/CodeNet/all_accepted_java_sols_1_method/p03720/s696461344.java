import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] array = new int[n];
        for (int i=0; i<m; i++) {
            int a = sc.nextInt() -1;
            int b = sc.nextInt() -1;
            array[a] = array[a]+1;
            array[b] = array[b]+1;
        }
        for (int i=0; i<n; i++) {
            System.out.println(array[i]);
        }
    }
}