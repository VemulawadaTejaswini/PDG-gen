import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    int b = scan.nextInt();
    if ((b<2*a)||(b>4*a)||(b%2!=0)){
      System.out.println("No");
    }
    else{
      System.out.println("Yes");
    }
  }
}
