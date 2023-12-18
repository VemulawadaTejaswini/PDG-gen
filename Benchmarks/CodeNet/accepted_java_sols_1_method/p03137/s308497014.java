import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] ar = new int[M];
        for (int i = 0; i < M; i++) {
            ar[i] = sc.nextInt();
        }
        Arrays.sort(ar);
        int[] dis = new int[M-1];
        for (int i = 0; i < dis.length; i++) {
            dis[i] = Math.abs(ar[i] - ar[i+1]);
        }
        Arrays.sort(dis);
        long count = 0;
        for (int i = 0; i < dis.length-N+1; i++) {
            count += dis[i];
        }
        System.out.println(count);
    }
}