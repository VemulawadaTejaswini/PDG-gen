import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main (String args[]) {
        // input

        int a;
        int b;

        Scanner inp = new Scanner(System.in);

        a = inp.nextInt();

        b = inp.nextInt();

       while (b != 0) {
           int temp = a;
           a = b;
           b = temp%b;
       }

       System.out.println(a);
    }
}
