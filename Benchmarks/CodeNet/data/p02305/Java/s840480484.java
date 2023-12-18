
import java.io.InputStreamReader;
import java.util.Scanner;

import static java.lang.Math.*;

public class Main{


    public static void main(String args[]){


        Scanner scan = new Scanner(System.in);

        Double x1 = Double.parseDouble(scan.next());
        Double y1 = Double.parseDouble(scan.next());
        Double r1 = Double.parseDouble(scan.next());

        Double x2 = Double.parseDouble(scan.next());
        Double y2 = Double.parseDouble(scan.next());
        Double r2 = Double.parseDouble(scan.next());

        if(r1 + r2 > sqrt(pow(x2 - x1, 2) + pow(y2 - y1, 2)) && max(r1, r2) - min(r1, r2) > sqrt(pow(x2 - x1, 2) + pow(y2 - y1, 2))){
            System.out.println(0);
        }else if(r1 + r2 > sqrt(pow(x2 - x1, 2) + pow(y2 - y1, 2)) && max(r1, r2) - min(r1, r2) == sqrt(pow(x2 - x1, 2) + pow(y2 - y1, 2))){
            System.out.println(1);
        }else if(r1 + r2 > sqrt(pow(x2 - x1, 2) + pow(y2 - y1, 2))){
            System.out.println(2);
        }else if(r1 + r2 == sqrt(pow(x2 - x1, 2) + pow(y2 - y1, 2))){
            System.out.println(3);
        }else if(r1 + r2 < sqrt(pow(x2 - x1, 2) + pow(y2 - y1, 2))){
            System.out.println(4);
        }




    }

}

