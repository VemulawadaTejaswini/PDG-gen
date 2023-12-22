import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    int num=scan.nextInt();
    int app;
    boolean flag=true;
    for(int x=0; x<num; x++){
      app=scan.nextInt();
      if(app%2==0){
        if(app%3==0 || app%5==0){
          flag=true;
        }else{
          flag=false;
          break;
        }
      }
    }
    if(flag){
      System.out.println("APPROVED");
    }else{
      System.out.println("DENIED");
    }
  }
}