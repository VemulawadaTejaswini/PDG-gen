import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();

    int o1=a-b;
    int o2=c-o1;
    if(o2>0){
      System.out.println(o2);
    }else{
      System.out.println(0);
    }
  }
}
