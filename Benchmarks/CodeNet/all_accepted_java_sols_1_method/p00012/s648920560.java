import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        try (Scanner sc = new Scanner(System.in)){
            while(sc.hasNextDouble()){
                double x1 = sc.nextDouble();
                double y1 = sc.nextDouble();
                double x2 = sc.nextDouble();
                double y2 = sc.nextDouble();
                double x3 = sc.nextDouble();
                double y3 = sc.nextDouble();
                double xp = sc.nextDouble();
                double yp = sc.nextDouble();
                double v1 = (x1-x3)*(yp-y3)-(xp-x3)*(y1-y3);
                double v2 = (x2-x1)*(yp-y1)-(xp-x1)*(y2-y1);
                double v3 = (x3-x2)*(yp-y2)-(xp-x2)*(y3-y2);
                if ((v1<0 && v2<0 && v3<0) || (v1>0 && v2>0 && v3>0)){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }
        }
    }
}
