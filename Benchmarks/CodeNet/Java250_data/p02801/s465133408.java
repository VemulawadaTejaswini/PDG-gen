import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main (String[] args)  {
        Scanner in = new Scanner(System.in);
        char input = in.next().charAt(0);
        int integerInput = input;
        integerInput++;
        char output= (char) integerInput;
        System.out.print(output);

    }
}