import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        double a, b, c, d, e, f, result1, result2;
        
        while(scan.hasNext()){
            a=scan.nextDouble();
            b=scan.nextDouble();
            c=scan.nextDouble();
            d=scan.nextDouble();
            e=scan.nextDouble();
            f=scan.nextDouble();
            result1=Math.round((b*f-c*e)/(b*d-a*e)*1000)*0.001;
            result2=Math.round((c*d-a*f)/(b*d-a*e)*1000)*0.001;
            System.out.printf("%.3f"+" "+"%.3f",result1,result2);
            System.out.println();
        }
    }
}
