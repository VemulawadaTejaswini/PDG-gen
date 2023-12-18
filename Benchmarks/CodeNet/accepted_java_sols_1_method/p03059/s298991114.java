import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    double t=sc.nextInt();
    int s=0;
    for(int i=1;i*a<t+0.5;i++){
      s=s+b;
    }
    System.out.println(s);
  }
}
