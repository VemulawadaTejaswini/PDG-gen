import java.util.Scanner;

import static java.lang.Math.PI;
import static java.lang.Math.sin;
import static java.lang.Math.pow;
import static java.lang.Math.cos;
import static java.lang.Math.sqrt;

class Main{
    
    public static void main(String[] arg){

        Scanner in = new Scanner(System.in);

        String input = in.nextLine();
        String [] param_line = input.split(" ", 0);

        double a = Double.parseDouble(param_line[0]);
        double b = Double.parseDouble(param_line[1]);
        double c_do = Double.parseDouble(param_line[2]);

        double c_rad = c_do/180*Math.PI;

        double h = b*Math.sin(c_rad);

        double S = a * h / 2;

        // 
        double c = sqrt(pow(a,2)+pow(b,2)-2*a*b*cos(c_rad));

        double L = a + b + c;

        System.out.println(S);
        System.out.println(L);
        System.out.println(h);
    }
}