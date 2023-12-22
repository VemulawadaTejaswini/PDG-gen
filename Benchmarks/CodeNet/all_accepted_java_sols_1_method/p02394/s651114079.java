import java.awt.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int W = sc.nextInt();
        int H = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int r = sc.nextInt();
        Rectangle bigRectangle = new Rectangle(0,0,W,H);
        Rectangle rectContainCircle = new Rectangle(x-r,y-r,2*r,2*r);
        if (bigRectangle.contains(rectContainCircle)){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}

