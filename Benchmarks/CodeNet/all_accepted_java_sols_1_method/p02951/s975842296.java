import java.util.Scanner;

class Main{
  public static void main(String[] arg){
    Scanner scan=new Scanner(System.in);
    int a=scan.nextInt();
    int b=scan.nextInt();
    int c=scan.nextInt();
    if(a-b<=c){
      System.out.println(c-a+b);
    }else{
      System.out.println(0);
    }
  }
}