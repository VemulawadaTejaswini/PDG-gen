import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        Double point1x,point1y,point2x,point2y;
        
        point1x=scan.nextDouble();
        point1y=scan.nextDouble();
        point2x=scan.nextDouble();
        point2y=scan.nextDouble();
        System.out.print(Math.hypot(point1x-point2x,point1y-point2y));
    }
}
