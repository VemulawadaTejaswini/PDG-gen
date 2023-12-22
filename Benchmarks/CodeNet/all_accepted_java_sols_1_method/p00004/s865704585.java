import java.util.*;
import java.math.BigDecimal;
import java.text.NumberFormat;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        float[] a = new float[6];
        float x,y = 0;
        NumberFormat nf = NumberFormat.getInstance();
        while(s.hasNext()){
            for(int i=0; i < 6; i++)
                a[i] = s.nextFloat();
            if(a[0]==0){
                y = a[2]/a[1];
                x = (a[5] - a[4]*y)/a[3];
            }else{
                float c = a[3]/a[0];
                y = (a[5]-c*a[2])/(a[4] - c*a[1]);
                x = (a[2] - a[1] * y)/a[0];
            }
            nf.setMinimumFractionDigits(3);
            BigDecimal x0 = new BigDecimal(x);
            BigDecimal x1 = x0.setScale(3, BigDecimal.ROUND_HALF_UP);
            BigDecimal y0 = new BigDecimal(y);
            BigDecimal y1 = y0.setScale(3, BigDecimal.ROUND_HALF_UP);
            System.out.println(nf.format(x1) + " " + nf.format(y1));
        }
    }
}