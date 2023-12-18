import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int m = sc.nextInt();

        int mina = Integer.MAX_VALUE;
        int[] arrA = new int[a];
        for(int i = 0;i < a;i++){
            arrA[i] = sc.nextInt();
            mina = Math.min(mina, arrA[i]);
        }
        int minb = Integer.MAX_VALUE;
        int[] arrB = new int[b];
        for(int i = 0;i < b;i++){
            arrB[i] = sc.nextInt();
            minb = Math.min(minb, arrB[i]);
        }

        int ans = mina + minb;
        for(int i = 0;i < m;i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int c = sc.nextInt();

            ans = Math.min(ans, arrA[x-1] + arrB[y-1] - c);
        }

        System.out.println(ans);
    }
}