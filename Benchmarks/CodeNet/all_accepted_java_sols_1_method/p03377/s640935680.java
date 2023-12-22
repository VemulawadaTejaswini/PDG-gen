import java.util.Scanner;

class Main{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    int b = scan.nextInt();
    int x = scan.nextInt();

    if(a+b < x){
      System.out.println("NO");
      return;
    }else{
      if(x - a < 0){
        System.out.println("NO");
        return;
      }else if(x - a == 0){
        System.out.println("YES");
        return;
      }else{
        System.out.println("YES");
        return;
      }

    }
  }
}
