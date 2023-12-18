import java.util.Scanner;
import java.lang.Math;
public class Main {
  public static void main (String[]args) {
    Scanner sc = new Scanner(System.in);
    int H = sc.nextInt();
    int W = sc.nextInt();
    int h = sc.nextInt(); 
    int w = sc.nextInt();
    int white_cells = H*W; //はじめの白ますの数
    white_cells -= h*W; //ｈ行分塗りつぶす
    white_cells -= w*(H-h);//ｗ＊（H-h）個塗りつぶす
    System.out.println(white_cells);

  
  }
}
