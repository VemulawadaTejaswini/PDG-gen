import java.util.*;

public class Main{
	public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
      int n= sc.nextInt();
      int x =sc.nextInt();
      int t =sc.nextInt();
      
      int c;
      int a;
      int d;
      c = n/x;
      a = c*t;
      d = a+t;
      System.out.println(d);
      
    }
}