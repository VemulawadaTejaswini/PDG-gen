import java.util.*;

public class Main{
	public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
      int n= sc.nextInt();
      int x =sc.nextInt();
      int t =sc.nextInt();
      
      int c;
      int a;
      c = (n+x-1)/x;
      a = c*t;
      System.out.println(a);
      
    }
}