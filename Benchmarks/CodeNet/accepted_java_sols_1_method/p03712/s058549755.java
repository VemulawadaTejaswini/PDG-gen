import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt(),w = sc.nextInt();
    String a[] = new String[h];
    for(int i = 0;i<h;i++){
      a[i] = sc.next();
    }
    for(int i = 0;i<w+1;i++){
      System.out.print("#");
    }
    System.out.println("#");
    for(int i = 0;i<h;i++){
      System.out.println("#"+a[i]+"#");
    }
    for(int i = 0;i<w+1;i++){
      System.out.print("#");
    }
    System.out.println("#");
  }
}