import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNext()){
            int n = in.nextInt();
            int k = in.nextInt();
            int[] h = new int[n];
            for (int i = 0; i < n; i++) {
                h[i] = in.nextInt();
            }
            Arrays.sort(h);
            int min = h[n - 1] - h[0];
            if(min == 0){
                System.out.println(0);
            }else{
                for (int i = 0; i <= n - k; i++) {
                    int sub = h[i + k - 1] - h[i];
                    if(sub < min){
                        min = sub;
                    }
                }
            }
            System.out.println(min);
        }
    }
}