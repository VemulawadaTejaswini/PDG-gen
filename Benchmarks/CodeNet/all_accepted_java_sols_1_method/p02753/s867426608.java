import java.util.Scanner;
import java.util.Arrays;
class Main{
public static void main(String[] args){
 Scanner scan = new Scanner(System.in);
 
 String S = scan.next();
 String[] split = S.split("");
  
   if (split[0].equals(split[1]) && split[1].equals(split[2]))
 	 System.out.println("No");
   else {
     System.out.println("Yes");
  }
 }
}