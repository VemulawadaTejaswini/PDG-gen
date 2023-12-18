import java.util.*;

class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int r=sc.nextInt();
    int d=sc.nextInt();
    int w=sc.nextInt();
    int a[]=new int[11];
    for(int i=0;i<11;i++){
      a[i]=w;
      w*=r;
      w-=d;
    }
    for(int i=1;i<=10;i++){
      System.out.println(a[i]);
    }
  }
}