import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double x = 0;
        double y = 0;
        double angle = 90;

        while(true){


            String line = sc.next();

            int a = 0;
            int b = 0;

            int index = 0;
            boolean minas = false;
            for(; index < line.length(); index++){
                if(line.charAt(index) == ','){
                    index++;
                    break;
                }else{
                    a *= 10;
                    a += Integer.parseInt("" + line.charAt(index));
                }
            }

            if(line.charAt(index) == '-'){
                minas = true;
                index++;
            }

            for(; index < line.length(); index++){
                b *= 10;
                b += Integer.parseInt("" + line.charAt(index));
            }

            if(minas){
                b *= -1;
            }


            int distance = a;
            int rot = b;
            if(distance == 0 && rot == 0){break;}

            x += Math.cos(Math.toRadians(angle)) * distance;
            y += Math.sin(Math.toRadians(angle)) * distance;
            angle -= (double)rot;

        }
        System.out.println((int)x);
        System.out.println((int)y);

    }
}