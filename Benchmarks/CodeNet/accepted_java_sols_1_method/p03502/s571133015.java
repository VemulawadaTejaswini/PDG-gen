import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int x = sc.nextInt();
      int y = x;
      int fx = 0;
      while(x >= 1){
      	fx += x%10;
        x = x/10;
      }
      if(y/fx == (double)y/fx ) System.out.println("Yes");
      else System.out.println("No");
    }
}