import java.util.*;
public class Main{
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int k = sc.nextInt();
      String str = sc.next();
      String first = str.substring(0,k-1);
      String x = str.substring(k-1,k);
      String last = str.substring(k,n);
      x = x.toLowerCase();
      System.out.println(first + x + last);
    }
}

