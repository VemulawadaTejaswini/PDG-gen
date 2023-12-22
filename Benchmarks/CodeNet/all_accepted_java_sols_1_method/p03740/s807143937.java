import java.util.*;
import java.io.*;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args)throws IOException{
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong(), y = sc.nextLong();
        String ans = Math.abs(x-y)>=2?"Alice":"Brown";
        System.out.println(ans);
    }
}
