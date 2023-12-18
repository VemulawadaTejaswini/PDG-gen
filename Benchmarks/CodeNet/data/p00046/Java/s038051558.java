import java.util.Arrays;
import java.util.List;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //最大値と最小値
        double max = 0;
        double min = 1000000;
        
        //数字が最大か最小か
        while(true) {
            double x;
            try {
                x = sc.nextDouble();
            }catch(Exception e) {
                break;
            }
            if(x > max) {
                max = x;
            }
            if(x < min) {
                min = x;
            }
        }
        System.out.println(max - min);
        
    }
}

