import java.util.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int counter = 0;
        for(int i = 0;i < 5;i++){
            int x = sc.nextInt();
            counter += 1;
            if(x == 0){
                System.out.println(counter);
            }
        }
    }
}
