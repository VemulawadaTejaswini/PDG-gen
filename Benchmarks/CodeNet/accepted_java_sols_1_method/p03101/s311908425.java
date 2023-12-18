import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int H = sc.nextInt();
    int W = sc.nextInt();
    int h = sc.nextInt();
    int w = sc.nextInt();
    
    int brack = h*W+w*H-h*w;
    int white =H*W-brack;
    System.out.println(white);
  }
}
    