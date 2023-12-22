import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int left = 0;
        int right = 0;

        for(int i=0; i<num; i++){
            String line1 = sc.next();
            String line2 = sc.next();

            if (line1.compareTo(line2) < 0){
                right+=3;
            } else if (line1.compareTo(line2) > 0){
                left+=3;
            } else {
                left++;
                right++;
            }
        }

        System.out.println(left + " " + right);
    }
}

