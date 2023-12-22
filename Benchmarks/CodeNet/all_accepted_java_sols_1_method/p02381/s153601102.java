import java.math.BigDecimal;
import java.util.Scanner;

//Solution:

public class Main {  
  public static void main(String[] args) {
        Scanner f = new Scanner(System.in);
        // fill in the dictionary with the initial value
         while(true) {
            int num = f.nextInt();
            if(num == 0) break;
            BigDecimal[] entries = new BigDecimal[num];
            BigDecimal sum = new BigDecimal(0);
            BigDecimal std = new BigDecimal(0);
            for (int i = 0; i < num; i++) {
                BigDecimal temp = new BigDecimal(f.nextInt());
                entries[i] = temp;
                sum = sum.add(temp);
            }
            BigDecimal average = sum.divide(new BigDecimal(num),6, BigDecimal.ROUND_HALF_UP);
            for (int i = 0; i < num; i++) {
                std = std.add(entries[i].subtract(average).pow(2));
            }
            System.out.println(Math.sqrt(std.divide(new BigDecimal(num),6, BigDecimal.ROUND_HALF_UP).doubleValue()));
        }
    }
}
