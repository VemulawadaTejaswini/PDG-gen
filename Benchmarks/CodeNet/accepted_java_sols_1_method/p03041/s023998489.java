import java.util.Scanner;
 
class Main {
  static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
      
      int a = sc.nextInt();
      int b = sc.nextInt();
      String s = sc.next();
      char[] s_chars = s.toCharArray();
      s_chars[b-1]+=32;
      
      System.out.print(s_chars);
      

      
    }
}