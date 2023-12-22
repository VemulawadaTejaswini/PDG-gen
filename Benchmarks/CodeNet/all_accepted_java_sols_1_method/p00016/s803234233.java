import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        double d,a,x,y,t;
        x = 0;
        y = 0;
        t = 90;
        Scanner sc = new Scanner(System.in).useDelimiter(",|\n");
        while(true){
            d = sc.nextDouble();
            a = sc.nextDouble();
            if ((d==0) && (a==0)){
                System.out.println((int)(x));
                System.out.println((int)(y));
                break;
            }
            x += d*Math.cos(t/180*3.141592);
            y += d*Math.sin(t/180*3.141592);
            t -= a;
        }
    }
}
