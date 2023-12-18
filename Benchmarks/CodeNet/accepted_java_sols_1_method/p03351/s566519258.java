import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Main {

  
private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
       
        String[] arrItems = scan.nextLine().split(" ");

             int a = Integer.parseInt(arrItems[0].trim());
             int b = Integer.parseInt(arrItems[1].trim());
             int c = Integer.parseInt(arrItems[2].trim());
             int d = Integer.parseInt(arrItems[3].trim());
          
             if((Math.abs(a-c)<=d)||(Math.abs(a-b)<=d && Math.abs(b-c)<=d)){
                      System.out.println("Yes");
                   }
             else{
                         System.out.println("No");
                   }
        

    }
}
