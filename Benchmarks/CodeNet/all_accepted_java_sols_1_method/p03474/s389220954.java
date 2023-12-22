import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
  public static void main (String[] args) {
    
   int a,b;
   String str;

   Scanner sc = new Scanner (System.in);
   a=sc.nextInt();
   b=sc.nextInt();
   str=sc.next();    

   Pattern p = Pattern.compile("^[0-9]{"+a+"}-[0-9]{"+b+"}");
   Matcher m = p.matcher(str);
   if (m.find()) {
	System.out.println("Yes");
   } else {
 	System.out.println("No");
   }

  }
}