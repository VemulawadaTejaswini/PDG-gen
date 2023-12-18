import java.util.Scanner;

public class Main {
	public static void main(String[] args) {      
      Scanner sc = new Scanner(System.in);
      StringBuilder s = new StringBuilder(sc.next());
      while (true) {
        int B = s.indexOf("B"); 
        if (B == -1) break;
        if (B == 0) {
          s.deleteCharAt(B);
        } else {
          s.delete(B-1,B+1);
        }
      }
      System.out.println(s);
    }
}