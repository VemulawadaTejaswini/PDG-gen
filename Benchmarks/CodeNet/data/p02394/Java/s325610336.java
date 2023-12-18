import java.util.Scanner;
import java.lang.Math;
public class Main {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int flag=0;
        int W = a.nextInt();
        int H = a.nextInt();
        int x = a.nextInt();
        int y = a.nextInt();
        int r = a.nextInt();
        for (double i = 0; i < 90; i++) {
            double x_r = r * Math.cos(i);
            double y_r = r * Math.sin(i);
            if (x_r + x > W || y_r + y > H || y_r+y<0 ||x_r+x<0) {
                System.out.println("No");
                flag=1;
                break;
            }
        }
        if(flag==0){
            System.out.println("Yes");
        }
    }
}