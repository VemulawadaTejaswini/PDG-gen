import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n], y = new int[n], h = new int[n];
        for(int i = 0; i < n; i++){
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
            h[i] = sc.nextInt();
        }
        for(int X = 0; X <= 100 ; X++){
            for(int Y = 0; Y <= 100; Y++){
                boolean flg = true;
                int H =0;
                for(int i = 0; i < n; i++){
                    if(h[i] != 0){
                        H = Math.abs(x[i] - X) + Math.abs(y[i] - Y) + h[i];
                    }
                }
                for(int i = 0; i < n; i++){
                    if(h[i] != 0){
                        if(H != Math.abs(x[i] - X) + Math.abs(y[i] - Y) + h[i])
                        flg = false;
                    }else{
                        if(H > Math.abs(x[i] - X) + Math.abs(y[i] - Y))
                        flg = false;
                    }
                }
                if(flg){
                    System.out.println(X + " " + Y + " " + H);
                }
            }
        }
    }
}