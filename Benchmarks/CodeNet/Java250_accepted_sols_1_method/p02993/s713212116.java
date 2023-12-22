import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      String str = sc.next();
      String x1 = str.substring(0,1);
      String x2 = str.substring(1,2);
      String x3 = str.substring(2,3);
      String x4 = str.substring(3,4);
      if(x1.equals(x2)||x2.equals(x3)||x3.equals(x4))
        System.out.println("Bad");
      else System.out.println("Good");
    }
}
