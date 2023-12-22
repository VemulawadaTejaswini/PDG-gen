import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n1 = sc.nextInt();
    int four = 4;
    int seven = 7;
    int a = n1;
    
    if(n1%four==0 || n1%seven==0){
      System.out.println("Yes");
      return;
    }
    
    while(n1 > 0){
      n1 -= seven;
      if(n1 > 0 && n1 % four == 0){
        System.out.println("Yes");
        return;
      }
    }
    
    while(a > 0){
      a -= four;
      if(n1 > 0 && n1 % seven == 0){
        System.out.println("Yes");
        return;
      }
    }
    
    System.out.println("No");
  }
}
