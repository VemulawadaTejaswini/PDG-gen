
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Scanner sc = new Scanner("");
        double w = Double.parseDouble(sc.next());
        double h = Double.parseDouble(sc.next());
        double x = Double.parseDouble(sc.next());
        double y = Double.parseDouble(sc.next());
        double  area = w * h / 2;

        int flagBit = 0;

        if(x*2==w && y*2==h){
            flagBit = 1;
        }
        System.out.println(area + " " + flagBit);
        
    }
}