import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    // 硬貨
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    if(a + b < c){
      System.out.println("No");
    }else{
      System.out.println("Yes");
    }
  }
}