import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        String[] array = new String[n];
        for (int i=0;i<n;i++) {
            array[i] = sc.next();
        }
        Arrays.sort(array);
        for (String s:array) {
            System.out.print(s);
        }
        System.out.println();
    }
}