import java.util.Scanner;

public class Main {    
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      s.useDelimiter("\n");
      int n = s.nextInt();
      String str = s.next().toString();


      int sLen = str.length() / 2;
      String ans = "";
      String s1 = str.substring(0, sLen).toString();
      String s2 = str.substring(sLen).toString();

      if (s1.equals(s2)) {
        ans = "Yes";
      } else {
        ans = "No";
      }

      if (n % 2 == 1) {
        ans = "No";
      }

      System.out.println(ans);

	
  }
}
