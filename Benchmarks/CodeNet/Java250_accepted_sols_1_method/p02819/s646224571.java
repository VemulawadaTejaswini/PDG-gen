import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    int x=scan.nextInt();
    int Ans=0, x1=0;
    boolean flag=false;
    if(x==2){
      Ans=2;
      flag=true;
    }else if(x%2==0){
      x1=x+1;
    }else{
      x1=x;
    }
    while(!flag){
      for(int a=2; a<x1; a++){
        if(x1%a==0){
          flag=true;
        }
      }
      if(!flag){
        Ans=x1;
        flag=true;
      }else{
        flag=false;
      }
      x1+=2;
    }
    System.out.println(Ans);
  }
}