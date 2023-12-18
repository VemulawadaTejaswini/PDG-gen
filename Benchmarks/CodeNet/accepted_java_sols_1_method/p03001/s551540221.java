import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double W = sc.nextDouble();
        double H = sc.nextDouble();
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double ans;
        int flag=0;
        sc.close();

        ans = W*H/2;

        if(x == W/2 && y == H/2){
            flag = 1;
        }

        System.out.println(ans + " " + flag);

    }
}