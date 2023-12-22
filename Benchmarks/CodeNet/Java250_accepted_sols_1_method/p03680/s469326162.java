import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int a [] = new int [N];
        for (int i = 0 ; i < N ; i++ ) {
            a[i] = sc.nextInt();
        }
        int count = 0;
        int temp = 1;
        for (int i = 0 ; i < N ; i++ ) {
             temp = a[temp - 1];
             count++;
             if (temp == 2) {
                 System.out.println(count);
                 return;
             }
        }
        System.out.println(-1);

    }

}