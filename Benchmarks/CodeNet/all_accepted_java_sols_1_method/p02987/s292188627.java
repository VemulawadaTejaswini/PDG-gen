import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      String str = sc.next();
      String a1 = str.substring(0,1);
      String a2 = str.substring(1,2);
      String a3 = str.substring(2,3);
      String a4 = str.substring(3,4);
      if(a1.equals(a2) && a3.equals(a4) && !(a1.equals(a3))) System.out.println("Yes");
      else if(a1.equals(a3) && a2.equals(a4) && !(a1.equals(a2))) System.out.println("Yes");
      else if(a1.equals(a4) && a2.equals(a3) && !(a1.equals(a2))) System.out.println("Yes");
      else System.out.println("No");
    }
}
