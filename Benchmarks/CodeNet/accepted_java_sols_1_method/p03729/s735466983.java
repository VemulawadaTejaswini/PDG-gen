import java.io.*;
import java.lang.reflect.Array;
import java.nio.channels.ScatteringByteChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
 
public class Main {
    public static void main (String[] args) throws IOException
    {
    	  Scanner sc = new Scanner(System.in);
    	  String A = sc.next();
    	  String B = sc.next();
    	  String C = sc.next();
    	  
    	  if (A.charAt(A.length() -1) == B.charAt(0) && B.charAt(B.length() -1) == C.charAt(0)){
    		  System.out.println("YES");
    	  } else {
    		  System.out.println("NO");
    	  }
    	  
    }
    
}
    