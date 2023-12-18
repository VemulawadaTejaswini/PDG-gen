import java.util.*;
public class Main
{
    public static Scanner sc = new Scanner(System.in);
	public static void main(String[]args)
    {
      String str = sc.next();
      int len = str.length();
      if(str.charAt(len-1)!='s')
      	System.out.println(str + 's');
      else
        System.out.println(str + "es");
    }
}
