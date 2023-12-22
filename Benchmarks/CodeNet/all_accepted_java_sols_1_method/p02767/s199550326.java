import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.jar.Attributes.Name;
import java.util.stream.Stream;


public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(input.readLine());
        String[] an = input.readLine().split(" ");
        double ave = 0.0;
        double[] na = Stream.of(an).mapToDouble(Double::parseDouble).toArray();
        for(double a : na){
            ave = ave + a;
        }
        int b = na.length;
        ave = ave / (double) b;
        ave = Math.round(ave);
        double sum = 0;
        for(double c : na){
        double v = Math.abs(c - ave);
        sum = sum + ( v * v );
        }

        System.out.println((long)sum);


    }
}

