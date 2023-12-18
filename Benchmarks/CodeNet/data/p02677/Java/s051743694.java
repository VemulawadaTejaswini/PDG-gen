import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double A = sc.nextInt();
        double B = sc.nextInt();
        double H = sc.nextInt();
        double M = sc.nextInt();
        double ans;
        
        double sho = (H * 60 + M) * 360 / ( 12 * 60 );
        double lon = M * 360 / 60;
        double ang;
        
        ang = Math.abs(sho - lon);
        
        ans = Math.sqrt(A * A + B * B 
                - 2.0 * A * B * Math.cos(Math.toRadians(ang)));
        
        System.out.print(ans);
    }
}