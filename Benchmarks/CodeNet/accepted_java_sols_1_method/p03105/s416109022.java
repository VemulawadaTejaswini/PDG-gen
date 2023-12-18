import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      int cost = (int) b/a;
      if(cost >= c) System.out.println(c);
      else System.out.println(cost);
    }
}