import java.util.*;

class Main{
	public static void main(String args[]){
      Scanner in = new Scanner(System.in);  
      int x = in.nextInt();
      int y = in.nextInt();
      boolean flag = false;
      for (int i = 0; i <= x; i++){
        if (2 * i + 4 * (x - i) == y){
          flag = true;
          System.out.println("Yes");
        }
      }
      
      if (!flag)
        System.out.println("No");
    }
}
