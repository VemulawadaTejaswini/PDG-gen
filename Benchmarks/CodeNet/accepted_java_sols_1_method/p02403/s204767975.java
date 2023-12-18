import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    while(true){
    int h = sc.nextInt();
    int w = sc.nextInt();
      int i,j;
      for(j=0;j<h;j++){
        for(i=0;i<w;i++)
          System.out.printf("#");
        System.out.printf("\n");
      }
    if(h==0 && w==0) break;
    System.out.printf("\n");
    }
    sc.close();
  }
}
