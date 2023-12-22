import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int a1 = scan.nextInt();
    int a2 = scan.nextInt();
    int b1 = scan.nextInt();
    int b2 = scan.nextInt();
    while ((b1>0)&&(a1>0)){
      b1-=a2;
      a1-=b2;
    }
    if (b1<=0){
      System.out.println("Yes");
    }
    else{
      System.out.println("No");
    }
  }
}
