import java.util.*;

public class Main {
	  public static void main(String args[]){
      	Scanner scan = new Scanner(System.in);
            
        String s1 = scan.next();
        String s2 = scan.next();
        String s3 = scan.next();
        
        String s1_large = s1.toUpperCase();
        String s2_large = s2.toUpperCase();
        String s3_large = s3.toUpperCase();
            
        System.out.println(s1_large.substring(0,1) + s2_large.substring(0,1) + s3_large.substring(0,1));
	  }
}