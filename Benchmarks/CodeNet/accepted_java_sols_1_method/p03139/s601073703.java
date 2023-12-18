import java.util.*;
import java.util.Scanner;
import static java.util.Comparator.*;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        String In = scanner.nextLine();
        String[] input = In.split(" ");
        
        int all = Integer.parseInt(input[0]);
        Integer x_scribe = Integer.parseInt(input[1]);
        Integer y_scribe = Integer.parseInt(input[2]);

        int min = 0, max = 0;

        if(x_scribe + y_scribe > all){
            min = (x_scribe + y_scribe) - all;
        }else{
            min = 0;
        }
        if(x_scribe.compareTo(y_scribe) > -1){
            max = y_scribe;
        }else{
            max = x_scribe;
        }
        System.out.println(max + " " + min);
    }
}