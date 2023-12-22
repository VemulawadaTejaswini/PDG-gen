import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int min = Integer.MAX_VALUE;
        int ans = 0;
        for (int i = 0 ; i < N; i++){
            int digit = sc.nextInt();
            if (min > digit){
                min = digit;
                ans ++;
            }
        }
        System.out.println(ans);
        sc.close();
    }
}
