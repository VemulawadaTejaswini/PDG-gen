
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // 入力(A B C)
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int[] ary = {a, b, c};
        Arrays.sort(ary);

        System.out.println((ary[0]==5 && ary[1]==5 && ary[2]==7) ? "YES": "NO");
        sc.close();
    }
}
