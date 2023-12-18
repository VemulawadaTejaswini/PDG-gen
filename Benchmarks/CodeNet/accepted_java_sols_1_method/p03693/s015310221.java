import java.util.*;
 
 
import java.io.*;
public class Main {
public static void main (String[]args){
    String val = "";
    Scanner in = new Scanner(System.in);
    String input = in.nextLine();    // get the entire line after the prompt 
    String[] numbers = input.split(" "); // split by spaces
    val = numbers[0] + numbers[1] + numbers[2];
   if(Integer.parseInt(val)%4==0) {
       System.out.println("YES");
   }
   else{
       System.out.println("NO");
   }
}
}
