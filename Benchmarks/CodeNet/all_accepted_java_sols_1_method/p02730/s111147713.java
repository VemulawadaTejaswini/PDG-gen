import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	String s = sc.next();
    StringBuffer sb = new StringBuffer(s);
    String rs = sb.reverse().toString();
    boolean b = true;
    int n = s.length();
    if(!rs.equals(s))
      b = false;
      String s1 = s.substring(0 , (n - 1) / 2);
      String s2 = rs.substring((n + 1) / 2 , n);
    if(!s1.equals(s2))
      b = false;
      String s3 = rs.substring(0 , (n - 1) / 2 );
      String s4 = s.substring((n + 1) / 2 , n);
    if(!s3.equals(s4))
      b = false;
	System.out.println(b ? "Yes" : "No");
	}
}