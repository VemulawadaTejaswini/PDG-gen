import java.util.Arrays;
import java.util.List;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //数字が最大か最小か
        while(true) {
            double x;
            try {
                x = sc.nextDouble();
            }catch(Exception e) {
                break;
            }
            if(x <= 48.0) {
                System.out.println("light fly");
            }else if(x <= 51.0) {
                System.out.println("fly");
            }else if(x <= 54.0) {
                System.out.println("bantam");
            }else if(x <= 57.0) {
                System.out.println("feather");
            }else if(x <= 60.0) {
                System.out.println("light");
            }else if(x <= 64.0) {
                System.out.println("light welter");
            }else if(x <= 69.0) {
                System.out.println("welter");
            }else if(x <= 75.0) {
                System.out.println("light middle");
            }else if(x <= 81.0) {
                System.out.println("middle");
            }else if(x <= 91.0) {
                System.out.println("light heavy");
            }else if(x > 91.0) {
                System.out.println("heavy");
            }
        }
    }
}

