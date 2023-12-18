import java.util.Scanner;
import java.math.BigDecimal;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double a[] = new double[2];
        double c[] = new double[2];
        a[0] = sc.nextDouble();
        a[1] = sc.nextDouble();
        c[0] = sc.nextDouble();
        c[1] = sc.nextDouble();

        double max =  Double.NEGATIVE_INFINITY;
        for(int i=0;i<a.length;i++){
            double x = a[i];
            for(int j=0;j<c.length;j++){
                double y = c[j];
              //System.out.println(x*y);
                if(x*y>max) max = x*y;
            }
        }
        System.out.print(max);
    }
}