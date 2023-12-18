import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt(), w=sc.nextInt();
    String frame="";
    for(int i=1; i<=w+2; i++){
      frame +="#";
    }
    System.out.println(frame);
    for(int i=0; i<h;i++){
      String[] pic = sc.next().split("");
      System.out.print("#");
      for(int j=0; j<w; j++){
        System.out.print(pic[j]);
      }
      System.out.println("#");
    }
    System.out.println(frame);
  }
}