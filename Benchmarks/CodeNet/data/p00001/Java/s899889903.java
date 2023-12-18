import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] h = new int[10];
        for(int i = 0; i < 10; i++){
            h[i] = sc.nextInt();
        }
        Arrays.sort(h);
        System.out.printf("%d\n%d\n%d\n", h[9], h[8], h[7]);
    }
}