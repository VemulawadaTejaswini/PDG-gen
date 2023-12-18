import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    
    int W = scan.nextInt();
    int H = scan.nextInt();
    int x = scan.nextInt();
    int y = scan.nextInt();
    int r = scan.nextInt();


    if(W < x+r && x-r < 0) System.out.println("No");
    else if(H < y+r && y-r < 0) System.out.println("No");
    else System.out.println("Yes");
  }
}