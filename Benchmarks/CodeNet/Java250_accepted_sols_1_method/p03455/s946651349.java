import java.io.*;
import java.util.*;

public class Main {

    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();

        a = a * b;

        b = a;
        a = a/2;
        a = a*2;

        if(a == b){ System.out.println("Even"); }
        else{ System.out.println("Odd"); }

    }
}