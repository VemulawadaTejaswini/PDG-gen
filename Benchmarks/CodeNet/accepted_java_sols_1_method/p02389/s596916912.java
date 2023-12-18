import java.util.*;
import java.lang.*;
  
public class Main{
  public static void main(String[] args){
    Scanner stdIn=new Scanner(System.in);
    int a=stdIn.nextInt(), b=stdIn.nextInt();
    int S=a*b, C=2*a+2*b;
    System.out.println(S+" "+C);
  }
}
