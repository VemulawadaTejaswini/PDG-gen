import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    int A=scan.nextInt();
    int B=scan.nextInt();
    int x=A-B*2;
    if(x<0){
      System.out.println("0");
    }else{
      System.out.println(x);
    }
  }
}