import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] d = new int[n];
        for(int i = 0; i < n; i++){
            d[i] = scan.nextInt();
        }
        Arrays.sort(d);
        System.out.println(d[n / 2] - d[n / 2 - 1]);
    }
}