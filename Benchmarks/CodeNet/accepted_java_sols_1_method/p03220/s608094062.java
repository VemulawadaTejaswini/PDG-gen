import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double t = sc.nextInt();
        double a = sc.nextInt();
        double[] h = IntStream.range(0, n).mapToDouble(i -> sc.nextInt()).toArray();
        
        int result = 0;
        double min = Double.MAX_VALUE;
        for(int i = 0; i < h.length; i++) {
            double diff = Math.abs(a - (t - (h[i] * 0.006)));
            if(diff < min) {
                min = diff;
                result = i;
            }
        }
        
        System.out.println(result + 1);
    }
}
