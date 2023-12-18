import java.util.*;

class Main{
	public static void main(String args[]){
      Scanner in = new Scanner(System.in);  
      int x = in.nextInt();
      int y = in.nextInt();
      if (4 * x - y < 0)
        System.out.println("No");
      else if (y % 2 == 1)
        System.out.println("No");
      else
         System.out.println("Yes");
    }
}
