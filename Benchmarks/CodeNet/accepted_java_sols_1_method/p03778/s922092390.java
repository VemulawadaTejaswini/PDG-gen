import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int w=sc.nextInt();
    int a=sc.nextInt();
    int b=sc.nextInt();
    sc.close();
    int d=0;
    if(Math.abs(a-b)>w){
      d=Math.abs(a-b)-w;
    }
    System.out.println(d);
  }
}