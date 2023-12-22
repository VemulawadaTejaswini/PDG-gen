import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int a1 = sc.nextInt();
      int a2 = sc.nextInt();
      int a3 = sc.nextInt();
      int x = Math.abs(a1-a2);
      int y = Math.abs(a2-a3);
      int z = Math.abs(a3-a1);
      int max1 = Math.max(x,y);
      int max2 = Math.max(z,max1);
      System.out.println(x+y+z-max2);
      sc.close();
    }
}
