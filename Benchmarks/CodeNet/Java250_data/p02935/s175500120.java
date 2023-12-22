import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.IntToDoubleFunction;
 
/**
 * @author yoshizaki
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int num = scanner.nextInt();
        List<Double> values = new ArrayList<Double>();
        for (int i = 0 ; i < num ; i++) {
            values.add(scanner.nextDouble());
        }
        Collections.sort(values);
        for(int i = 0; i < num-1 ; i++) {
            Double v = (values.get(i) + values.get(i+1))/2;
            values.set(i+1, v);
        }
        System.out.println( values.get(num-1));
    
    
        
    }
}