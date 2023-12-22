import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    int a=scan.nextInt();
    int b=scan.nextInt();
    int c=scan.nextInt();
    if((a==b && a!=c) || (a==c && a!=b) || (b==c && b!=a)){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}