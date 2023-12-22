import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] d = new int[n];
        for(int i = 0; i < n; i++) {
            d[i] = sc.nextInt();
        }
        Arrays.sort(d);
        int low = d[n/2-1];
        int high = d[n/2];
        System.out.println(high - low);
    }
}
