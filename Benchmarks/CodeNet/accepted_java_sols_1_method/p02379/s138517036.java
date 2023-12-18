import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

class Main{
    
    public static void main(String[] arg){

        Scanner in = new Scanner(System.in);

        String input = in.nextLine();
        String [] param_line = input.split(" ", 0);

        double x1 = Double.parseDouble(param_line[0]);
        double y1 = Double.parseDouble(param_line[1]);
        double x2 = Double.parseDouble(param_line[2]);
        double y2 = Double.parseDouble(param_line[3]);

        double d = sqrt(pow(x2-x1,2)+pow(y2-y1, 2));

        System.out.println(d);
    }
}