import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] x = new int[n];
        for(int i = 0; i < k; i++){
            int d = scan.nextInt();
            for(int j = 0; j < d; j++){
                x[scan.nextInt() - 1]++;
            }
        }
        int out = 0;
        for(int i = 0; i < n; i++){
            if(x[i] == 0){
                out++;
            }
        }
        System.out.println(out);
    }
}