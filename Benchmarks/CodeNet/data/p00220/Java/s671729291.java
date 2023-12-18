import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(;;) {
            double n = sc.nextDouble();
            if (n<0)
                break;
            if(n>=256) {
                System.out.println("NA");continue;
            }
           String m=Integer.toBinaryString((int)n);
           while(m.length()<8) {
               m="0"+m;
           }
           String r=m+".";
           double a=n-(int)n;
           r+=a>=1/2D?1:0;
           if(a>=1/2D)
           a-=1/2D;
           r+=a>=1/4D?1:0;
           if(a>=1/4D)
           a-=1/4D;
           r+=a>=1/8D?1:0;
           if(a>=1/8D)
           a-=1/8D;
           r+=a>=1/16D?1:0;   
           if(a>=1/16D)
           a-=1/16D;
           if(a>0) {
               System.out.println("NA");
           }else {
               System.out.println(r);
           }
        }
    }
}
