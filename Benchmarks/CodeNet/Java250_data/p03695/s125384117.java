import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    boolean[] b=new boolean[8];
    int r=0;
    for(int i=0;i<n;i++){
      int a=sc.nextInt();
      if(a>=3200){
        r++;
      }else{
        b[a/400]=true;
      }
    }
    int y=0;
    for(int i=0;i<8;i++){
      if(b[i]){
        y++;
      }
    }
    if(r==0){
      System.out.print(y+" ");
    }else{
      System.out.print(Math.max(y,1)+" ");
    }
    System.out.println(y+r);
  }
}