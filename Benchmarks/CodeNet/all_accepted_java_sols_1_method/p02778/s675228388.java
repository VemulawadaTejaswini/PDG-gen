import java.util.Scanner;
 public class Main {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
      
        String a ="";
      
      for(int i=0;i<S.length();i++){
        a =a+"x";
      }
      System.out.println(a);
    }
 }