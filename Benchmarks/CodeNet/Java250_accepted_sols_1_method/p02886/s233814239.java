import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int d[] = new int[num];
        int ans = 0;
        for(int i = 0; i<num; i++){
            d[i] =  sc.nextInt();
        }
        for(int i = 0; i<num; i++){
            for(int j = i + 1; j<num; j++){
                //System.out.println("i"+d[i]);
                //System.out.println("j"+d[j]);
                ans = ans + d[i] * d[j];
                //System.out.println("ans"+ans);
            }
        }
        System.out.println(ans);
    }
}