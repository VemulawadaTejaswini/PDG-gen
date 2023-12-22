import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    boolean flg=false;
    long k;
    for(k=0;k<1000000000;k++){
      if(Math.abs(a-k)==Math.abs(b-k)){
        flg=true;
        break;
      }
    }
    if(flg){
      System.out.println(k);
    }else{
      System.out.println("IMPOSSIBLE");
    }
  }
}