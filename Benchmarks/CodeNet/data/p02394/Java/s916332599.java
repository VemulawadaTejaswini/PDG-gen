import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int w = sc.nextInt();
    int h = sc.nextInt();
    int x = sc.nextInt();
    int y = sc.nextInt();
    int r = sc.nextInt();
    if((r>x)||(r>y)||(r>w-x)||(r>h-y)){
      System.out.println("No");
    }else{
      System.out.println("Yes");
    }
  }
}