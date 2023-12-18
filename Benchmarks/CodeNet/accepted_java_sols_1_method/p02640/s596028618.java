import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int x = scan.nextInt();
    int y = scan.nextInt();
    System.out.println(x*2<=y&&x*4>=y&&y%2==0?"Yes":"No");
  }
}