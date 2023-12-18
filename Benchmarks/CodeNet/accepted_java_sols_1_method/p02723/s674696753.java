import java.util.Scanner;
class Main {
 public static void main(String[] args) {
   Scanner read = new Scanner(System.in);
   String word = read.nextLine();
   if((word.charAt(2)==word.charAt(3)) && (word.charAt(4)==word.charAt(5))) {
     System.out.println("Yes");
   } else {
    System.out.println("No"); 
   }
 }
}