
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class Main {
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
      
      int a=s.nextInt();
      int b=s.nextInt();
      int c=s.nextInt();
      
      if(a+b+c>=22)
        System.out.println("bust");
      else
        System.out.println("win");
    }
  
}