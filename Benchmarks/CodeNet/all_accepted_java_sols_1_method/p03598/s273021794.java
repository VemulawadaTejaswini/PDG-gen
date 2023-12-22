import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int n = in.nextInt();
        int type_a = n;
        int type_b = n;
        int k = in.nextInt();
        int total_dist = 0;
        for (int i = 0; i < n; i++){
            int x = in.nextInt();
            if ( x <= Math.abs(k-x) && type_a >0){
                total_dist += 2*x;
                type_a--;
            }
            else{
                total_dist += 2*Math.abs(k-x);
                type_b--;
            }
        }

        System.out.println(total_dist);
    }
}