import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = Integer.parseInt(sc.next());
    int b = Integer.parseInt(sc.next());
    int x = Integer.parseInt(sc.next());
    if(a + b >= x && x >= a){
      System.out.println("YES");
    }else{
      System.out.println("NO");
    }
  }
}