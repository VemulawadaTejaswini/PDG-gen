import java.util.*;
// import java.io.*;
public class Main {
  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   String n = sc.next();
   int calc = 0;
   for(int i=0;i < n.length();i++){
     calc += n.charAt(i)-'0';
   }
   if (calc % 9 == 0) {
     System.out.println("Yes");
   }
   else{
     System.out.println("No");
   }
  }
}
