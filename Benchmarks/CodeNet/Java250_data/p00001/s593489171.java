import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] a){
        Integer[] values = new Integer[10];
        Scanner scan = new Scanner(System.in);
        
        for(int i=0; i<10; i++)
            values[i] = scan.nextInt();
 
        Arrays.sort(values, Collections.reverseOrder());

        for(int i=0; i<3; i++)
            System.out.println(values[i]);
    }
}