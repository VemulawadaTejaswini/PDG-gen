import java.util.Scanner;
public class Main{
    public static void calc(double x1, double y1, double x2, double y2, double px, double py){
        if(y1 == y2)
            System.out.println(px + " " + (py - 2*(py - y1)));
        else if(x1 == x2)
            System.out.println((px - 2*(px - x1)) + " " + py);
        else{
            double katamuki1 = (y2 - y1)/(x2 - x1);
            double seppen1 = -1.0 * katamuki1 * x1 + y1;
            double katamuki2 = -1.0 / katamuki1;
            double seppen2 = -1.0 * katamuki2 * px + py;
            double ansx = (seppen2 - seppen1)/(katamuki1 - katamuki2);
            double ansy = ansx * katamuki1 + seppen1;
            System.out.println((px - 2*(px - ansx)) + " " + (py- 2 * (py - ansy)));
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int q = sc.nextInt();
        for(int i = 0 ; i < q ; i++){
            int px = sc.nextInt();
            int py = sc.nextInt();
            calc((double)x1,(double)y1,(double)x2,(double)y2,(double)px,(double)py);
        }
    }
}
