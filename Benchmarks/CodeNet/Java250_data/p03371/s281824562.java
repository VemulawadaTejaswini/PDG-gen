import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static  void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
       int a = scanner.nextInt();
       int b = scanner.nextInt();
       int c = scanner.nextInt();
       int x = scanner.nextInt();
       int y = scanner.nextInt();
       int x_y_max = Math.max(x,y);

       int ans = a*x+b*y;
       for(int i = 0; i <= x_y_max*2; i += 2){
           ans = Math.min(a*check(x-i/2) + b*check(y-i/2) + c*i,ans);
           //System.out.println(ans);
       }
       System.out.println(ans);
    }
    public static int check(int z){
        if (z > 0){
            return z;
        }else{
            return 0;
        }
    }
}
