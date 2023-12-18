import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int H = scan.nextInt();
    int W = scan.nextInt();
    while(H != 0 || W != 0){
      StringBuilder sb = new StringBuilder();
      for(int i=0; i<W; i++ ){
        sb.append("#");
      }
      for(int j=0; j<H; j++){
        System.out.println(sb);
      }
      System.out.println("");
      H = scan.nextInt();
      W = scan.nextInt();
    }
    
  }
}