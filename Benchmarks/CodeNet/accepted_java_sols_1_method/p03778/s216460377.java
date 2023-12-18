import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
   int w = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();
    int aw= a+ w;
    int bw= b + w;
    if(bw>a && aw>b){
      System.out.println(0);
    }else if(Math.abs(b-aw)<Math.abs(a-bw)){
      System.out.println(Math.abs(b-aw));
    }else{
      System.out.println(Math.abs(a-bw));
    }
  }
}
