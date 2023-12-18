import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = c - (a - b);
    if(d < 0){
      System.out.println(0);
    }else{
      System.out.println(d);
    }
  }
}