import java.util.*;
import java.io.*;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args)throws IOException{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt();
        int max = Math.min(a,b);
        int min = Math.max(0,a+b-n);
        System.out.print(Integer.toString(max)+" "+Integer.toString(min));
    }
}
