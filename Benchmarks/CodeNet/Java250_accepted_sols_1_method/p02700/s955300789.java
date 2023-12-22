import java.util.*;

public class Main {
	public static void main(String[] args){
	Scanner scn = new Scanner(System.in);
	int a = scn.nextInt();
      int b = scn.nextInt();
      int c = scn.nextInt();
      int d = scn.nextInt();
      int x = c/b;
      int y = a/d;
      int xx = c%b;
      int yy = a%d;
      if(xx != 0){
        x = x+1;
      }
      if(yy != 0){
        y = y+1;
      }
      if(x<=y){
        System.out.println("Yes");
      }else{
        System.out.println("No");
      }
	}
}