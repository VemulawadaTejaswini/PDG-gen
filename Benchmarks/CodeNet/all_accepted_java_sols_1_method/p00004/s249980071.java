import java.util.Scanner;
import java.math.BigDecimal;
 
class Main{
    public static void main(String[] args){
        Scanner scanline = new Scanner (System.in);
        while(scanline.hasNext()){
            String lines = scanline.nextLine();
            Scanner scan = new Scanner(lines);
            double a = scan.nextDouble();
            double b = scan.nextDouble();
            double c = scan.nextDouble();
            double d = scan.nextDouble();
            double e = scan.nextDouble();
            double f = scan.nextDouble();
            double ansx = (c*e-b*f)/(a*e-b*d);
            double ansy = (a*f-c*d)/(a*e-b*d);
            BigDecimal xx = new BigDecimal(String.valueOf(ansx));
            BigDecimal yy = new BigDecimal(String.valueOf(ansy));
            double x = xx.setScale(4,BigDecimal.ROUND_DOWN).doubleValue();
            double y = yy.setScale(4,BigDecimal.ROUND_DOWN).doubleValue();
            if (x == -0.000){
                x = 0.000;
            }
            if (y == -0.000){
                y = 0.000;
            }
            System.out.printf("%.3f %.3f\n",x,y);
        }
    }   
}