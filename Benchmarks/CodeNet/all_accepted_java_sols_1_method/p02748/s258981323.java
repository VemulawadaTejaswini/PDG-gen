import java.util.*;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int m = sc.nextInt();

        int[] arrA = new int[a];
        int[] arrB = new int[b];

        for (int i=0; i<a; i++) {
            arrA[i] = sc.nextInt();
        }
        for (int i=0; i<b; i++) {
            arrB[i] = sc.nextInt();
        }

        int minA = Integer.MAX_VALUE;
        int minB = Integer.MAX_VALUE;

        for (int i=0; i<a; i++) {
            minA = Math.min(minA, arrA[i]);
        }
        for (int i=0; i<b; i++) {
            minB = Math.min(minB, arrB[i]);
        }

        int ans = minA+minB;

        for (int i=0; i<m; i++) {
            int x = sc.nextInt()-1;
            int y = sc.nextInt()-1;
            int c = sc.nextInt();
            ans = Math.min(ans, arrA[x]+arrB[y]-c);
        }

        System.out.print(ans);
    }

}

