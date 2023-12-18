import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int lim = sc.nextInt();

        for(int i = 0; i < lim; i++){
            double x1 = sc.nextDouble();
            double y1 = sc.nextDouble();
            double x2 = sc.nextDouble();
            double y2 = sc.nextDouble();
            double x3 = sc.nextDouble();
            double y3 = sc.nextDouble();
            double x4 = sc.nextDouble();
            double y4 = sc.nextDouble();

            if((x1-x2)*(x3-x4)==0){
                if(x1+x3-x2-x4==0){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
                continue;
            }

            if((y1-y2)/(x1-x2) == (y3-y4)/(x3-x4)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }

    }
}