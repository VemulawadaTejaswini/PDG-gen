import java.util.Scanner;

/*
問題文

*/

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n-1; i++) {
            int tmp = sc.nextInt();
            a[tmp-1] += 1;
        }
        a[n-1] = 0;

        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }
}