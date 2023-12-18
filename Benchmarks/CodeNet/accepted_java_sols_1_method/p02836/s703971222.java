//import for Scanner and other utility classes
import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class Main {
    public static void main(String args[] ) throws Exception {
     
        Scanner s = new Scanner(System.in);
      String ss=s.next();
      int c=0;
      for(int i=0;i<ss.length();i++){
      if(ss.charAt(i)!=ss.charAt(ss.length()-i-1))
        c++;
      }
      System.out.println(c/2);
    }
}