import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    String aa,bb;
    aa = bb = "";
    for(int i = 0;i < b; i++){
      aa += a;
  }
    for(int i = 0;i < a; i++){
      bb += b;
    }
    System.out.println(aa.compareTo(bb) > 0 ? bb : aa);
  }
    
}