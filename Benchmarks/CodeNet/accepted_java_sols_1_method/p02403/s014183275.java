import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int [] h = new int [10000];
    int [] w = new int [10000];
    int m = 0;
    for(int i=0;;i++){
      int H = sc.nextInt();
      int W = sc.nextInt();
      h[i] = H;
      w[i] = W;
      if(H == 0 && W == 0) break;
      m++;
    }
    for(int l=0;l<m;l++){
      for(int j=0;j<h[l];j++){
        for(int k=0;k<w[l];k++){
          System.out.printf("#");
        }
        System.out.printf("\n");
      }
      System.out.printf("\n");
    }
  }
}

