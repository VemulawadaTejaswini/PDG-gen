import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //String str = sc.next();
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double H = sc.nextDouble();
        double M = sc.nextDouble();
        
        double hx = A*Math.sin(Math.toRadians(H*30+M*0.5));
        double hy = A*Math.cos(Math.toRadians(H*30+M*0.5));
        double mx = B*Math.sin(Math.toRadians(M*6));
        double my = B*Math.cos(Math.toRadians(M*6));
        
        //System.out.println(hx);
        //System.out.println(hy);
        //System.out.println(mx);
        //System.out.println(my);
        
        double dist = Math.sqrt((hx-mx)*(hx-mx)+(hy-my)*(hy-my));
        System.out.println(dist);
    }
}
