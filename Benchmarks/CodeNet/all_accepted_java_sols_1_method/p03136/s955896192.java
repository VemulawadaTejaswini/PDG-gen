import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] l = new int[n];
        for (int i = 0; i < l.length; i++) {
            l[i] = sc.nextInt();
        }
        Arrays.sort(l);
        int max = l[n - 1];
        int total = 0;
        for (int i = 0; i < l.length - 1; i++) {
            total += l[i];
        }
        if(max < total)System.out.println("Yes");
        else System.out.println("No");
    }
}