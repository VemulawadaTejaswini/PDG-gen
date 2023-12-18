import java.io.IOException;
import java.util.Scanner;
import java.lang.String;
public class Main {

	public static void main(String[] args) throws IOException {
		// TODO ?????????????????????????????????????????????
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      String b = sc.next();
      int c = sc.nextInt();
      int d;
      
      d=0;
      
      if(b.equals("+")){d=a+c;
      System.out.println(d);}
      else if (b.equals("-")){d=a-c;
      System.out.println(d);}
      else if (b.equals("*")){d=a*c;
      System.out.println(d);}
      else if (b.equals("/")){d=a/c;
      System.out.println(d);}
      else {return;}
      
	}