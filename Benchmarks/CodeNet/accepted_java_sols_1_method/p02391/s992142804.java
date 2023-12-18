/* ITP1_2_A */

import java.io.*;
import java.util.*;

public class Main {
    public static void main (String[] args) throws java.lang.Exception {
    
    BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
    String txt = input.readLine();
    String[] text = txt.split(" ");
    int A = Integer.parseInt(text[0]);
    int B = Integer.parseInt(text[1]);
    if ( A < B ) {
        System.out.println("a < b");
    } else if ( A > B ) {
        System.out.println("a > b");
    } else {
        System.out.println("a == b");
    }
  }
}

