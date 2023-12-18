import java.util.*;


public class Main 
{
    public static void main(String[] args )
    {
        Scanner scan = new Scanner(System.in);
    
        int A = scan.nextInt();
        int B = scan.nextInt();
        int H = scan.nextInt();
        int M = scan.nextInt();
        Double Zc = 0.0;

        Double Mc = 0.0;

        Double Hc = 0.0;

            Mc = M * 6.0;
        
            Hc = H * 30.0;
            Hc += (M/2);

            Zc = Math.abs(Hc - Mc);

            if(Math.abs(Hc - Mc)>180)Zc = 360 - Zc;

        /*
            System.out.println(Zc+"角度");
        
            System.out.println(Math.toRadians(Zc)+"ラジアン");

            System.out.println((int)Math.cos(Math.toRadians(Zc))+"コサインラジアン");

        */
        double ans_z = (Double) Math.sqrt(B * B + A * A - (2 * B * A)*Math.cos(Zc * Math.PI/180));

        System.out.println(String.format("%.10f", ans_z));
    }
}
