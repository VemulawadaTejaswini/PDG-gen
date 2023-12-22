import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long ac = 0;
        int[] hArray = new int[n];
        for(int i = 0; i < n; i++) hArray[i] = Integer.parseInt(sc.next());
        Arrays.sort(hArray);
        n -= k;
        for(int i = 0; i < n; i++) ac += hArray[i];
        System.out.println(ac);
    }
}