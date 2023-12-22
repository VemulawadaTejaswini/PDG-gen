import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int p=sc.nextInt();
    int q=sc.nextInt();
    int r=sc.nextInt();
    int x,y,z;
    x=p+q;
    y=q+r;
    z=r+p;
    if(x<=y&&x<=z){
      System.out.println(x);
    }
    if(y<=x&&y<=z&&x!=y){
      System.out.println(y);
    }
    if(z<=x&&z<=y&&z!=x&&z!=y){
      System.out.println(z);
    }
  }
}
