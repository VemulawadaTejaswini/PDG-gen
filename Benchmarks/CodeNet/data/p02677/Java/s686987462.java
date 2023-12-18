import java.util.*;

public class Main {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        Integer a = scan.nextInt(); //時針
        Integer b = scan.nextInt(); //分針
        Integer h = scan.nextInt();
        Integer m = scan.nextInt();

        //角度
        double radh = h*(360/12);
        double radm = m*(360/60);
        System.out.println("h:"+radh+", m:"+radm);
        double diff = Math.toRadians(Math.abs(radh-radm));
        System.out.println(diff);
        
        //余弦の定理 a^2=b^2+c^2−2bccosA 
        double c= Math.sqrt(Math.pow(a,2)+Math.pow(b,2)-(2*a*b*Math.cos(diff)));
        System.out.println(c);

        scan.close();
        }    
}