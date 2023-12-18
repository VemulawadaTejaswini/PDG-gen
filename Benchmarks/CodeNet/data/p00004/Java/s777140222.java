import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            int e = sc.nextInt();
            int f = sc.nextInt();
            
            float delta = a * e - b * d;
            
            if (Math.abs((e * c - b * f) / delta)< 1e-3){
                float x = 0;
                System.out.printf("%.3f ", x);
            }else{
                float x = Math.abs((e * c - b * f) / delta);
                System.out.printf("%.3f ", x);
            }
            
            if (Math.abs((a * f - d * c) / delta) < 1e-3){
                float y = 0;
                System.out.printf("%.3f\n", y);
            }else{
                float y = Math.abs((a * f - d * c) / delta);
                System.out.printf("%.3f\n", y);
            }
        }
    }
}