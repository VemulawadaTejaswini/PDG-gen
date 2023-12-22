import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      String str = sc.next();
      String s1 = str.substring(0,2);
      String s2 = str.substring(2,4);
      int x = Integer.parseInt(s1);
      int y = Integer.parseInt(s2);
      if(x>=1 && x<=12 && y>=1 && y<=12) System.out.println("AMBIGUOUS");
      else if(x>=1 && x<=12) System.out.println("MMYY");
      else if(y>=1 && y<=12) System.out.println("YYMM");
      else System.out.println("NA");
    }
}
