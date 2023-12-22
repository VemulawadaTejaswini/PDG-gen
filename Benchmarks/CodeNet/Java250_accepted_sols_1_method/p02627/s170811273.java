import java.util.*;
class Main {
 public static void main(String[] args) {
   Scanner scan = new Scanner(System.in);
   String str = scan.nextLine();
   if(str == str.toUpperCase()) {
   	System.out.println('A');
   } else {
    System.out.println('a');
   }
 }
}