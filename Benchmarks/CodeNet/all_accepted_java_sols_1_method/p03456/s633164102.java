import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = 0;
      if(b<=9) c = a*10+b;
      else if(b <= 99) c = a*100+b;
      else if(b == 100) c = a*1000+100;
      
      int d = (int) Math.sqrt(c);
      
      if(d*d == c) System.out.println("Yes");
      else System.out.println("No");
    }
}