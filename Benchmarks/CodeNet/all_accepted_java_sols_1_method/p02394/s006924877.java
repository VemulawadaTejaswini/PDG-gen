import java.util.*;
import java.lang.*;
  
public class Main{
  public static void main(String[] args){
    Scanner stdIn=new Scanner(System.in);
    int W=stdIn.nextInt();
    int H=stdIn.nextInt();
    int x=stdIn.nextInt();
    int y=stdIn.nextInt();
    int r=stdIn.nextInt();
    if (x-r<0||y-r<0||x+r>W||y+r>H){
	System.out.println("No");
    }else{
	System.out.println("Yes");
    }
  }
}

