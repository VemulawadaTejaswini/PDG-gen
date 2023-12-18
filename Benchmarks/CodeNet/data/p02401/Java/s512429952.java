import java.io.IOException;
import java.util.Scanner;
import java.lang.String;
public class Main {

	public static void main(String[] args) throws IOException {
		// TODO ?????????????????????????????????????????????
      Scanner sc = new Scanner(System.in);
     
      int d;
      String b;
      b="+";
      d=0;
      
      while(!b.equals("?")){
    	  int a = sc.nextInt();
          b = sc.next();
          int c = sc.nextInt();
      if(b.equals("+")){d=a+c;
      System.out.println(d);}
      else if (b.equals("-")){d=a-c;
      System.out.println(d);}
      else if (b.equals("*")){d=a*c;
      System.out.println(d);}
      else if (b.equals("/")){d=a/c;
      System.out.println(d);}
      else if (b.equals("?")){return;}
      }
	}

}