    import java.util.*;
     
    public class Main{
     
         public static void main(String []args) throws Exception {
            Scanner sc = new Scanner(System.in);
            double w = sc.nextDouble();
            double h = sc.nextDouble();
            double x = sc.nextDouble();
            double y = sc.nextDouble();
           
           int ans = 0;
           if(w/2==x && h/2==y) ans = 1;
           double area = w*h;
           area/=2;
           System.out.printf("%.9f", area);
           System.out.print(" "+ans);
    }  
     
    }