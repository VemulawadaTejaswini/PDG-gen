import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.math.*;

public class Main {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
        List<Double> list = new ArrayList<>();
        
        list.add(sc.nextDouble());
         System.out.print(String.format("%.5f",Math.pow(list.get(0),2)*Math.PI));
         System.out.print(String.format(" %.5f",list.get(0)*2*Math.PI));
    }
}
       
