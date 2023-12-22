import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int k = sc.nextInt(),a = sc.nextInt(),b = sc.nextInt();
    boolean flg=false;
    for(int i=a;i<=b;i++){
      if(i%k==0){
        flg=true;
        break;
      }
    }
    if(flg){
      pl("OK");
    }else{
      pl("NG");
    }
  }

  public static void pr(String str){
    System.out.print(str);
  }
  public static void pl(String str){
    System.out.println(str);
  }
}
