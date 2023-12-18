import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double x1,y1,x2,y2,x,y,s;
        x1=scan.nextDouble();
        y1=scan.nextDouble();
        x2=scan.nextDouble();
        y2=scan.nextDouble();
        x=x2-x1;
        y=y2-y1;
        s=Math.sqrt(x*x+y*y);
        System.out.println(s);
    }
}
