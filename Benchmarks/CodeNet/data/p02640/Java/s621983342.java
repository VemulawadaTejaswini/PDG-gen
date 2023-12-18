import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int x =sc.nextInt();
    int y =sc.nextInt();
    if(y%2==1){
      System.out.println("No");
    }else if(y>=2*x && y<=4*x){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}