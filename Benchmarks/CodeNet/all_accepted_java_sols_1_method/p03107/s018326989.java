import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      String s = sc.next();
      
      int n = 0;
      
      for(int i = 0; i <s.length(); i++){
        if(s.charAt(i) == '1'){
          n += 1;
        } else {
          n -= 1;
        }
      }
      
      System.out.println(s.length() - Math.abs(n));
          
      
    }
}