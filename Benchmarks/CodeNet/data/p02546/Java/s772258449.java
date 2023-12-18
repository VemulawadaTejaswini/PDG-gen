import java.util.*;
class Main {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();
      
      if(str.charAt(str.length() - 1) == 's') {
          str += "es";
      }
      else {
          str += "s";
      }
      
      System.out.print(str);
    }
}