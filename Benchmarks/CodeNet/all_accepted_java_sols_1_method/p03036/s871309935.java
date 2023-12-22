import java.util.Scanner;

public class Main {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int r = sc.nextInt();
    int D = sc.nextInt();
    int x2000 = sc.nextInt();
    
    int oldx = x2000;
    int newx = 0;
    
    for (int i=0;i<10;i++) {
    	newx = oldx * r - D;
    	oldx = newx;
    	System.out.println(newx);    	
    }


  }

}