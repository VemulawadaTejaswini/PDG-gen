import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        double W = sc.nextDouble();
        double H = sc.nextDouble();
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        System.out.println((W*H) / 2);
        if (((W/x) == 2) && ((H/y) == 2))
            System.out.println(1);
        else
            System.out.println(0);
        sc.close();
    }
}