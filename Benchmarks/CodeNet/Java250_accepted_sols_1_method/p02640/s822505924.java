import java.util.*;

public class Main{
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int all = sc.nextInt();
      int leg = sc.nextInt();
      for(int i = 0; i<= all; i++){
      	if(((i*2) + (all-i)*4) == leg){
          System.out.println("Yes");
          return;
        }
      }
      System.out.println("No");
    }
}