import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    int a=scan.nextInt();
    int b=scan.nextInt();
    if(a>b*2){
      System.out.println(a-b*2);
    }else{
      System.out.println(0);
    }
  }
}