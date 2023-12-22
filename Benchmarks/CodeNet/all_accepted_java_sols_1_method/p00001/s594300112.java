import java.io.PrintStream;
import java.util.*;
import java.util.Scanner ; 
import java.math.BigInteger;
import java.util.Arrays;
import java.text.DecimalFormat;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] a = new int[10];
        int n;
        
        for(int i = 0 ; i<10 ; i++){
            n = sc.nextInt();
            a[i]=n;
        }
        Arrays.sort(a);
        System.out.println(a[9]+"\n"+a[8]+"\n"+a[7]);
    }
}