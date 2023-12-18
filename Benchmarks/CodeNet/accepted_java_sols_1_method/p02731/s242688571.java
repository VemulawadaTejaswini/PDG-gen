import java.text.DecimalFormat;
import java.util.*;

public class Main {

    public static void main(String [] commandLineArgument){

        Scanner input = new Scanner(System.in);
        double l  = input.nextDouble();
        double single = l/3;
        double answer = single * single * single;
        System.out.println(String.format("%.6f" , answer));
        input.close();
    }

}

