import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      String str = sc.next();
      int count = 0;
	  if(str.substring(0,1).equals("o")) count++;
      if(str.substring(1,2).equals("o")) count++;
      if(str.substring(2,3).equals("o")) count++;
      System.out.println(700 + 100*count);
    }
}
