import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int ary[] = new int[n];        

        for (int i = 0; i < ary.length; i++) {
            ary[i] = sc.nextInt();
        }
        
        int i, j, tmp = 0;
        long sum = 0;
        // ソート
        for (i = 0; i < ary.length; i++) {
            for (j = i + 1; j < ary.length; j++) {
                
                if (ary[i] > ary[j]) {
                    tmp = ary[i];
                    ary[i] = ary[j];
                    ary[j] = tmp; // ary[i] をary[j]に入れる
                }                
            }
            sum += ary[i];
        }
        
        System.out.printf("%d %d %d%n", ary[0], ary[n-1],sum);
        
        

        sc.close();

    }


}
