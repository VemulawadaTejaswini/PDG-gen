import java.util.Scanner;

class Main{
  public static void main(String args[]){
    Scanner scan=new Scanner(System.in);
    int num=scan.nextInt();
    int a[]=new int[num];
    int box=0, Ans=0;
    boolean flag1=true;
    for(int x=0; x<num; x++){
      a[x]=scan.nextInt();
      if(flag1){
        if(a[x]==1){
          box=1;
          flag1=false;
        }else{
          Ans++;
        }
      }else{
        if(box+1==a[x]){
          box++;
        }else{
          Ans++;
        }
      }
    }
    if(flag1){
      System.out.println(-1);
    }else{
      System.out.println(Ans);
    }
  }
}