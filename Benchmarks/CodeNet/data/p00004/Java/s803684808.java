
import java.math.BigDecimal;
import java.util.Scanner;

class Main{


    public static void main(String[] a){

    	double aa;
    	double b;
    	double c;
    	double d;
    	double e;
    	double f;


    	double x;
    	double y;

    	Scanner sc = new Scanner(System.in);

        while(sc.hasNext()) {

        	aa = sc.nextInt();
        	b = sc.nextInt();
        	c = sc.nextInt();
        	d = sc.nextInt();
        	e = sc.nextInt();
        	f = sc.nextInt();

         	x = (c / b - f / e) / (aa / b - d / e);
    		y = (c - aa * x) / b;

    		 BigDecimal xx = new BigDecimal(x);
    		 BigDecimal yy = new BigDecimal(y);

    		 xx = xx.setScale(3, BigDecimal.ROUND_HALF_UP);
    		 yy = yy.setScale(3, BigDecimal.ROUND_HALF_UP);

        	System.out.printf("%.3f",xx);
        	System.out.printf(" ");
        	System.out.printf("%.3f\n",yy);



        }


        sc.close();



   }


}