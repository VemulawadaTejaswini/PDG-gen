/* ITP1_1_D */

import java.io.*;
import java.util.*;

public class Main {
    public static void main (String[] args) throws java.lang.Exception {
    
    BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
    String txt = input.readLine();
    int text = Integer.parseInt(txt);
    int h = (text / 3600);
    int m = ((text % 3600) / 60);
    int s = (text % 60);
    System.out.println(h + ":" + m + ":" + s);
    
    }
}
