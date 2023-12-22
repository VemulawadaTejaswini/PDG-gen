import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      String str = String.valueOf(n);
      String x1 = str.substring(0,1);
      String x2 = str.substring(1,2);
      String x3 = str.substring(2,3);
      if(x1.equals("1"))x1 = "9";
      else x1 = "1";
      if(x2.equals("1"))x2 = "9";
      else x2 = "1";
      if(x3.equals("1"))x3 = "9";
      else x3 = "1";
      String str1 = x1+x2+x3;
      int n1 = Integer.parseInt(str1);
      System.out.println(n1);
      sc.close();
    }
}
